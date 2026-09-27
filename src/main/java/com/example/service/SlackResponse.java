package com.ggsim.slack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("ts")
    private String timestamp;

    @JsonProperty("error")
    private String error;

    public SlackResponse() {}

    public boolean isOk() {
        return ok;
    }

    public String getChannel() {
        return channel;
    }

    public String getError() {
        return error;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
