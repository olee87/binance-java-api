package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * History of account deposits.
 *
 * @see Deposit
 */
@Getter @Setter @EqualsAndHashCode
public class DepositHistory {

  @JsonProperty("depositList")
  private List<Deposit> depositList;

  private boolean success;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("depositList", depositList)
        .append("success", success)
        .toString();
  }
}
