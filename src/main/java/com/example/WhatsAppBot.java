package com.example;

import com.example.api.WhatsAppApiClient;

import java.util.List;

public class WhatsAppBot {
    private WhatsAppApiClient apiClient;

    public WhatsAppBot() {
        this.apiClient = new WhatsAppApiClient();
    }

    public void start() {
        // Initialize the bot and start listening for messages
        System.out.println("WhatsApp Bot is starting...");
        listenForMessages();
    }

    private void listenForMessages() {
        // Logic to listen for incoming messages and commands
        // This will involve setting up a webhook or polling mechanism
    }

    public void handleGroupCommand(String command, String groupId) {
        // Process group commands such as tagging members
        if (command.equalsIgnoreCase("tagMembers")) {
            tagGroupMembers(groupId);
        }
    }

    private void tagGroupMembers(String groupId) {
        List<String> groupMembers = apiClient.getGroupMembers(groupId);
        StringBuilder message = new StringBuilder("Tagging members: ");
        
        for (String member : groupMembers) {
            message.append("@").append(member).append(" ");
        }
        
        apiClient.sendMessage(groupId, message.toString());
    }

    public static void main(String[] args) {
        WhatsAppBot bot = new WhatsAppBot();
        bot.start();
    }
}