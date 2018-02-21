package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response returned when placing a new order on the system.
 *
 * @see NewOrder for the request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @EqualsAndHashCode
public class NewOrderResponse {

  /**
   * Order symbol.
   */
  private String symbol;

  /**
   * Order id.
   */
  private Long orderId;

  /**
   * This will be either a generated one, or the newClientOrderId parameter
   * which was passed when creating the new order.
   */
  private String clientOrderId;

  /**
   * Transact time for this order.
   */
  private Long transactTime;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("orderId", orderId)
        .append("clientOrderId", clientOrderId)
        .append("transactTime", transactTime)
        .toString();
  }
}
