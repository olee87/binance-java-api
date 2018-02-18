package com.binance.api.client.domain.account;

import lombok.Data;

/**
 * A deposit address for a given asset.
 */
@Data
public class DepositAddress {

  private String address;

  private boolean success;

  private String addressTag;

  private String asset;
}