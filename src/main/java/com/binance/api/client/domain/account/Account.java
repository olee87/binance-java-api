package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Account {

  /**
   * Maker commission.
   */
  private int makerCommission;

  /**
   * Taker commission.
   */
  private int takerCommission;

  /**
   * Buyer commission.
   */
  private int buyerCommission;

  /**
   * Seller commission.
   */
  private int sellerCommission;

  /**
   * Whether or not this account can trade.
   */
  private boolean canTrade;

  /**
   * Whether or not it is possible to withdraw from this account.
   */
  private boolean canWithdraw;

  /**
   * Whether or not it is possible to deposit into this account.
   */
  private boolean canDeposit;

  /**
   * Last account update time.
   */
  private long updateTime;

  /**
   * List of asset balances of this account.
   */
  private List<AssetBalance> balances;

  /**
   * Returns the asset balance for a given symbol.
   *
   * @param symbol asset symbol to obtain the balances from
   * @return an asset balance for the given symbol which can be 0 in case the symbol has no balance in the account
   */
  public AssetBalance getAssetBalance(String symbol) {
    for (AssetBalance assetBalance : balances) {
      if (symbol.equals(assetBalance.getAsset())) {
        return assetBalance;
      }
    }
    AssetBalance emptyBalance = new AssetBalance();
    emptyBalance.setAsset(symbol);
    emptyBalance.setFree("0");
    emptyBalance.setLocked("0");
    return emptyBalance;
  }
}
