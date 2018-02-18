package com.binance.api.client.domain.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AllMarketTickersEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("p")
  private double priceChange;

  @JsonProperty("P")
  private double priceChangePercent;

  @JsonProperty("w")
  private double weightedAveragePrice;

  @JsonProperty("x")
  private double previousDaysClosePrice;

  @JsonProperty("c")
  private double currentDaysClosePrice;

  @JsonProperty("Q")
  private long closeTradesQuantity;

  @JsonProperty("a")
  private double bestAskPrice;

  @JsonProperty("A")
  private long bestAskQuantity;

  @JsonProperty("o")
  private double openPrice;

  @JsonProperty("h")
  private double highPrice;

  @JsonProperty("l")
  private double lowPrice;

  @JsonProperty("v")
  private long totalTradedBaseAssetVolume;

  @JsonProperty("q")
  private long totalTradedQuoteAssetVolume;

  @JsonProperty("O")
  private long statisticesOpenTime;

  @JsonProperty("C")
  private long statisticesCloseTime;

  @JsonProperty("F")
  private long firstTradeId;

  @JsonProperty("L")
  private long lastTradeId;

  @JsonProperty("n")
  private long totalNumberOfTrades;
}
