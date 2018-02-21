package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @EqualsAndHashCode
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

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("priceChange", priceChange)
        .append("priceChangePercent", priceChangePercent)
        .append("weightedAveragePrice", weightedAveragePrice)
        .append("previousDaysClosePrice", previousDaysClosePrice)
        .append("currentDaysClosePrice", currentDaysClosePrice)
        .append("closeTradesQuantity", closeTradesQuantity)
        .append("bestAskPrice", bestAskPrice)
        .append("bestAskQuantity", bestAskQuantity)
        .append("openPrice", openPrice)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("totalTradedBaseAssetVolume", totalTradedBaseAssetVolume)
        .append("totalTradedQuoteAssetVolume", totalTradedQuoteAssetVolume)
        .append("statisticesOpenTime", statisticesOpenTime)
        .append("statisticesCloseTime", statisticesCloseTime)
        .append("firstTradeId", firstTradeId)
        .append("lastTradeId", lastTradeId)
        .append("totalNumberOfTrades", totalNumberOfTrades)
        .toString();
  }
}
