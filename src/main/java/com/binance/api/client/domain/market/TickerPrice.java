package com.binance.api.client.domain.market;

import lombok.Data;

/**
 * Wraps a symbol and its corresponding latest price.
 */
@Data
public class TickerPrice {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Latest price.
   */
  private String price;
}
