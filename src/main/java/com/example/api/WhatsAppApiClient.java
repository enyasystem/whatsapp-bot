package com.example.api;

import java.util.List;

public class WhatsAppApiClient {
    private String apiKey;
    private String baseUrl;

    public WhatsAppApiClient(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    public List<String> getGroupMembers(String groupId) {
        // Logic to interact with the WhatsApp API to retrieve group members
        // This should return a list of member IDs or phone numbers
    }

    public boolean sendMessage(String chatId, String message) {
        // Logic to send a message via the WhatsApp API
        // Return true if the message was sent successfully, false otherwise
    }

    public boolean mentionMembers(String groupId) {
        List<String> members = getGroupMembers(groupId);
        if (members == null || members.isEmpty()) {
            return false; // No members to mention
        }

        StringBuilder messageBuilder = new StringBuilder("Hello everyone! ");
        for (String member : members) {
            messageBuilder.append("@").append(member).append(" ");
        }

        return sendMessage(groupId, messageBuilder.toString());
    }
}