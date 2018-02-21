package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An asset balance in an Account.
 *
 * @see Account
 */
@Getter @Setter @EqualsAndHashCode
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

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("asset", asset)
        .append("free", free)
        .append("locked", locked)
        .toString();
  }
}
