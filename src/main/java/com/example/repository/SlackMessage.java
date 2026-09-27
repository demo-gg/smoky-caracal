package com.ggsim.slack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackMessage {

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("text")
    private String text;

    @JsonProperty("username")
    private String username;

    @JsonProperty("icon_emoji")
    private String iconEmoji;

    public SlackMessage() {}

    public SlackMessage(String channel, String text) {
        this.channel = channel;
        this.text = text;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
