package com.binance.api.client.domain.general;

import com.binance.api.client.exception.BinanceApiException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Current exchange trading rules and symbol information.
 * https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ExchangeInfo {

  private String timezone;

  private Long serverTime;

  private List<RateLimit> rateLimits;

  // private List<String> exchangeFilters;

  private List<SymbolInfo> symbols;

  /**
   * @param symbol the symbol to obtain information for (e.g. ETHBTC)
   * @return symbol exchange information
   */
  public SymbolInfo getSymbolInfo(String symbol) {
    return symbols.stream().filter(symbolInfo -> symbolInfo.getSymbol().equals(symbol))
        .findFirst()
        .orElseThrow(() -> new BinanceApiException("Unable to obtain information for symbol " + symbol));
  }
}
