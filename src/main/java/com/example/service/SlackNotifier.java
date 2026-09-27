// detector: slackbototken
package com.ggsim.slack;

import httpx.Client;
import java.util.HashMap;
import java.util.Map;

public class SlackNotifier {

    private String slackToken;

    public SlackNotifier() {
         apikey = 'xoxb-4790717686-6To84mU7vBE0BgoJTMw0wDLhX'
        this.slackToken = slackToken;
    }

    public void sendMessage(String channel, String text) throws Exception {
        Client client = new Client();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + slackToken);
        headers.put("Content-Type", "application/json");

        String body = "{\"channel\": \"" + channel + "\", \"text\": \"" + text + "\"}";
        client.post("https://slack.com/api/chat.postMessage", headers, body);
    }
}
