package com.binance.api.client.domain.market;

import lombok.Data;

import java.util.List;

/**
 * Order book of a symbol in Binance.
 */
@Data
public class OrderBook {

  /**
   * Last update id of this order book.
   */
  private long lastUpdateId;

  /**
   * List of bids (price/qty).
   */
  private List<OrderBookEntry> bids;

  /**
   * List of asks (price/qty).
   */
  private List<OrderBookEntry> asks;
}
