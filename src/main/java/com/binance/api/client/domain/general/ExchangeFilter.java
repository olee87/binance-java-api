package com.binance.api.client.domain.general;

import lombok.Data;

/**
 * Exchange Filters define trading rules an exchange.
 *
 * The MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on the exchange. Note that both "algo" orders and normal orders are counted for this filter.
 *
 * The MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on the exchange. "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
@Data
public class ExchangeFilter {

  private FilterType filterType;

  private Integer limit;
}
