package com.binance.api.client.domain.general;

import lombok.Data;

/**
 * Rate limits.
 */
@Data
public class RateLimit {

  private RateLimitType rateLimitType;

  private RateLimitInterval interval;

  private Integer limit;
}
