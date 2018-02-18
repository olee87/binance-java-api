package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * History of account deposits.
 *
 * @see Deposit
 */
@Data
public class DepositHistory {

  @JsonProperty("depositList")
  private List<Deposit> depositList;

  private boolean success;
}
