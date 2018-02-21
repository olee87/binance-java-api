package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Trade order information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @EqualsAndHashCode
public class Order {

  /**
   * Symbol that the order was put on.
   */
  private String symbol;

  /**
   * Order id.
   */
  private Long orderId;

  /**
   * Client order id.
   */
  private String clientOrderId;

  /**
   * Price.
   */
  private String price;

  /**
   * Original quantity.
   */
  private String origQty;

  /**
   * Original quantity.
   */
  private String executedQty;

  /**
   * Order status.
   */
  private OrderStatus status;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  private TimeInForce timeInForce;

  /**
   * Type of order.
   */
  private OrderType type;

  /**
   * Buy/Sell order side.
   */
  private OrderSide side;

  /**
   * Used with stop orders.
   */
  private String stopPrice;

  /**
   * Used with iceberg orders.
   */
  private String icebergQty;

  /**
   * Order timestamp.
   */
  private long time;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("orderId", orderId)
        .append("clientOrderId", clientOrderId)
        .append("price", price)
        .append("origQty", origQty)
        .append("executedQty", executedQty)
        .append("status", status)
        .append("timeInForce", timeInForce)
        .append("type", type)
        .append("side", side)
        .append("stopPrice", stopPrice)
        .append("icebergQty", icebergQty)
        .append("time", time)
        .toString();
  }
}
