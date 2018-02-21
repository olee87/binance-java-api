package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Exchange Filters define trading rules an exchange.
 *
 * The MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on the exchange. Note that both "algo" orders and normal orders are counted for this filter.
 *
 * The MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on the exchange. "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
@Getter @Setter @EqualsAndHashCode
public class ExchangeFilter {

  private FilterType filterType;

  private Integer limit;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("filterType", filterType)
        .append("limit", limit)
        .toString();
  }
}
