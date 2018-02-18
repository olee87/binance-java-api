package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import lombok.Getter;
import lombok.ToString;

/**
 * Base request parameters for order-related methods.
 */
@ToString @Getter
public class OrderRequest {

  private final String symbol;

  private Long recvWindow;

  private Long timestamp;

  public OrderRequest(String symbol) {
    this.symbol = symbol;
    this.timestamp = System.currentTimeMillis();
    this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
  }

  public OrderRequest recvWindow(Long recvWindow) {
    this.recvWindow = recvWindow;
    return this;
  }

  public OrderRequest timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
}
