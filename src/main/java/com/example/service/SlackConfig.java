package com.ggsim.slack;

public class SlackConfig {

    private static final String SLACK_API_BASE = "https://slack.com/api";
    private static final long TIMEOUT_MS = 30000L;
    private static final int MAX_RETRIES = 3;

    private String apiBaseUrl;
    private long timeoutMs;
    private int maxRetries;

    public SlackConfig() {
        this.apiBaseUrl = SLACK_API_BASE;
        this.timeoutMs = TIMEOUT_MS;
        this.maxRetries = MAX_RETRIES;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public long getTimeoutMs() {
        return timeoutMs;
    }

    public int getMaxRetries() {
        return maxRetries;
    }
}
