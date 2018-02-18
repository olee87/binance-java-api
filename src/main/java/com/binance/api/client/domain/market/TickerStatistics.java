package com.binance.api.client.domain.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 24 hour price change statistics for a ticker.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TickerStatistics {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Price change during the last 24 hours.
   */
  private String priceChange;

  /**
   * Price change, in percentage, during the last 24 hours.
   */
  private String priceChangePercent;

  /**
   * Weighted average price.
   */
  private String weightedAvgPrice;

  /**
   * Previous close price.
   */
  private String prevClosePrice;

  /**
   * Last price.
   */
  private String lastPrice;

  /**
   * Bid price.
   */
  private String bidPrice;

  /**
   * Ask price.
   */
  private String askPrice;

  /**
   * Open price 24 hours ago.
   */
  private String openPrice;

  /**
   * Highest price during the past 24 hours.
   */
  private String highPrice;

  /**
   * Lowest price during the past 24 hours.
   */
  private String lowPrice;

  /**
   * Total volume during the past 24 hours.
   */
  private String volume;

  /**
   * Open time.
   */
  private long openTime;

  /**
   * Close time.
   */
  private long closeTime;

  /**
   * First trade id.
   */
  private long firstId;

  /**
   * Last trade id.
   */
  private long lastId;

  /**
   * Total number of trades during the last 24 hours.
   */
  private long count;
}
