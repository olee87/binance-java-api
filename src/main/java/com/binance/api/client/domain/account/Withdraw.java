package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * A withdraw that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Withdraw {

  /**
   * Amount withdrawn.
   */
  private String amount;

  /**
   * Destination address.
   */
  private String address;

  /**
   * Symbol.
   */
  private String asset;

  private String applyTime;

  private String successTime;

  /**
   * Transaction id.
   */
  private String txId;

  /**
   * Id.
   */
  private String id;

  /**
   * (0:Email Sent,1:Cancelled 2:Awaiting Approval 3:Rejected 4:Processing 5:Failure 6:Completed)
   */
  private int status;
}
