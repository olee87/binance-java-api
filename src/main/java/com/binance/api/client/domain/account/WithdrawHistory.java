package com.binance.api.client.domain.account;

import lombok.Data;

import java.util.List;

/**
 * History of account withdrawals.
 *
 * @see Withdraw
 */
@Data
public class WithdrawHistory {

  private List<Withdraw> withdrawList;

  private boolean success;
}
