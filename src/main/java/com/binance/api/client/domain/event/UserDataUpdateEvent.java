package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * User data update event which can be of two types:
 *
 * 1) outboundAccountInfo, whenever there is a change in the account (e.g. balance of an asset)
 * 2) executionReport, whenever there is a trade or an order
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = UserDataUpdateEventDeserializer.class)
@Data
public class UserDataUpdateEvent {

  private UserDataUpdateEventType eventType;

  private long eventTime;

  private AccountUpdateEvent accountUpdateEvent;

  private OrderTradeUpdateEvent orderTradeUpdateEvent;

  @Override
  public String toString() {
    ToStringBuilder sb = new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime);
    if (eventType == UserDataUpdateEventType.ACCOUNT_UPDATE) {
      sb.append("accountUpdateEvent", accountUpdateEvent);
    } else {
      sb.append("orderTradeUpdateEvent", orderTradeUpdateEvent);
    }
    return sb.toString();
  }

  public enum UserDataUpdateEventType {
    ACCOUNT_UPDATE("outboundAccountInfo"),
    ORDER_TRADE_UPDATE("executionReport");

    private final String eventTypeId;

    UserDataUpdateEventType(String eventTypeId) {
      this.eventTypeId = eventTypeId;
    }

    public String getEventTypeId() {
      return eventTypeId;
    }

    public static UserDataUpdateEventType fromEventTypeId(String eventTypeId) {
      if (ACCOUNT_UPDATE.eventTypeId.equals(eventTypeId)) {
        return ACCOUNT_UPDATE;
      } else if (ORDER_TRADE_UPDATE.eventTypeId.equals(eventTypeId)) {
        return ORDER_TRADE_UPDATE;
      }
      throw new IllegalArgumentException("Unrecognized user data update event type id: " + eventTypeId);
    }
  }
}
