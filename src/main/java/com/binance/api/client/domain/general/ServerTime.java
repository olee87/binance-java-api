package com.binance.api.client.domain.general;

import lombok.Data;

/**
 * Time of the server running Binance's REST API.
 */
@Data
public class ServerTime {
  private Long serverTime;
}
