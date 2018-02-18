package com.binance.api.client.domain.market;

import lombok.Data;

/**
 * Represents the best price/qty on the order book for a given symbol.
 */
@Data
public class BookTicker {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Bid price.
   */
  private String bidPrice;

  /**
   * Bid quantity
   */
  private String bidQty;

  /**
   * Ask price.
   */
  private String askPrice;

  /**
   * Ask quantity.
   */
  private String askQty;
}
