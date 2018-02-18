package com.binance.api.client.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * An interval candlestick for a symbol providing informations on price that can be used to produce candlestick charts.
 */
@JsonDeserialize(using = CandlestickEventDeserializer.class)
@JsonSerialize(using = CandlestickEventSerializer.class)
@Data
public class CandlestickEvent {

  private String eventType;

  private long eventTime;

  private String symbol;

  private Long openTime;

  private String open;

  private String high;

  private String low;

  private String close;

  private String volume;

  private Long closeTime;

  private String intervalId;

  private Long firstTradeId;

  private Long lastTradeId;

  private String quoteAssetVolume;

  private Long numberOfTrades;

  private String takerBuyBaseAssetVolume;

  private String takerBuyQuoteAssetVolume;

  private Boolean barFinal;
}