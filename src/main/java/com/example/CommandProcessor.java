package com.example;

import java.util.List;

public class CommandProcessor {
    
    private final GroupHandler groupHandler;

    public CommandProcessor(GroupHandler groupHandler) {
        this.groupHandler = groupHandler;
    }

    public void processCommand(String command, String groupId) {
        if (command.equalsIgnoreCase("tagMembers")) {
            tagGroupMembers(groupId);
        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    private void tagGroupMembers(String groupId) {
        List<String> members = groupHandler.getGroupMembers(groupId);
        if (members.isEmpty()) {
            System.out.println("No members found in the group.");
            return;
        }

        StringBuilder message = new StringBuilder("Hello everyone! ");
        for (String member : members) {
            message.append("@").append(member).append(" ");
        }
        groupHandler.sendMessage(groupId, message.toString());
    }
}