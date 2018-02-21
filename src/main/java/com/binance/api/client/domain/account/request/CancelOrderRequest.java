package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Request object for canceling an order.
 */
@Getter
public class CancelOrderRequest extends OrderRequest {

  private Long orderId;

  private String origClientOrderId;

  /**
   * Used to uniquely identify this cancel. Automatically generated by default.
   */
  private String newClientOrderId;

  public CancelOrderRequest(String symbol, Long orderId) {
    super(symbol);
    this.orderId = orderId;
  }

  public CancelOrderRequest(String symbol, String origClientOrderId) {
    super(symbol);
    this.origClientOrderId = origClientOrderId;
  }

  public CancelOrderRequest orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public CancelOrderRequest origClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
    return this;
  }

  public CancelOrderRequest newClientOrderId(String newClientOrderId) {
    this.newClientOrderId = newClientOrderId;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("orderId", orderId)
        .append("origClientOrderId", origClientOrderId)
        .append("newClientOrderId", newClientOrderId)
        .toString();
  }
}
