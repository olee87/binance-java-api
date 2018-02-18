package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * A deposit that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Deposit {

  /**
   * Amount deposited.
   */
  private String amount;

  /**
   * Symbol.
   */
  private String asset;

  /**
   * Deposit time.
   */
  private String insertTime;

  /**
   * Transaction id
   */
  private String txId;

  /**
   * (0:pending,1:success)
   */
  private int status;
}
