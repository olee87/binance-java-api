package com.binance.api.client.domain.account;

import lombok.Data;

/**
 * An asset balance in an Account.
 *
 * @see Account
 */
@Data
public class AssetBalance {

  /**
   * Asset symbol.
   */
  private String asset;

  /**
   * Available balance.
   */
  private String free;

  /**
   * Locked by open orders.
   */
  private String locked;
}
