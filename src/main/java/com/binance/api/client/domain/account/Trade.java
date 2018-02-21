package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents an executed trade.
 */
@Getter @Setter @EqualsAndHashCode
public class Trade {

  /**
   * Trade id.
   */
  private Long id;

  /**
   * Price.
   */
  private String price;

  /**
   * Quantity.
   */
  private String qty;

  /**
   * Commission.
   */
  private String commission;

  /**
   * Asset on which commission is taken
   */
  private String commissionAsset;

  /**
   * Trade execution time.
   */
  private long time;

  @JsonProperty("isBuyer")
  private boolean buyer;

  @JsonProperty("isMaker")
  private boolean maker;

  @JsonProperty("isBestMatch")
  private boolean bestMatch;

  private String orderId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("price", price)
        .append("qty", qty)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .append("time", time)
        .append("buyer", buyer)
        .append("maker", maker)
        .append("bestMatch", bestMatch)
        .append("orderId", orderId)
        .toString();
  }
}
