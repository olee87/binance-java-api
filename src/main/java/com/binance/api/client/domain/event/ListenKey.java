package com.binance.api.client.domain.event;

import lombok.Data;

/**
 * Dummy type to wrap a listen key from a server response.
 */
@Data
public class ListenKey {
  private String listenKey;
}
