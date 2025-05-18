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
        // Process group commands such as tagging members or showing menu
        if (command.equalsIgnoreCase("tagMembers")) {
            tagGroupMembers(groupId);
        } else if (command.equalsIgnoreCase("menu")) {
            String menu = getMenuMessage();
            apiClient.sendMessage(groupId, menu);
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

    private String getMenuMessage() {
        // You can further customize these values dynamically if needed
        String prefix = ".";
        String user = "Kingsley";
        String time = "09:02 AM";
        String day = "Sunday";
        String date = "18/5/2025";
        String version = "3.8.6";
        String plugins = "217";
        String ram = "21195/128723MB";
        String uptime = "31h 44m 54s";
        String platform = "vps (Linux generic)";
        return "╭═══ LEVANTER ═══⊷\n" +
                "┃❃╭──────────────\n" +
                "┃❃│ Prefix : " + prefix + "\n" +
                "┃❃│ User : " + user + "\n" +
                "┃❃│ Time : " + time + "\n" +
                "┃❃│ Day : " + day + "\n" +
                "┃❃│ Date : " + date + "\n" +
                "┃❃│ Version : " + version + "\n" +
                "┃❃│ Plugins : " + plugins + "\n" +
                "┃❃│ Ram : " + ram + "\n" +
                "┃❃│ Uptime : " + uptime + "\n" +
                "┃❃│ Platform : " + platform + "\n" +
                "┃❃╰───────────────\n" +
                "╰═════════════════⊷\n" +
                " ╭─❏ ᴀɪ ❏\n" +
                " │ 𝙱𝙸𝙽𝙶\n" +
                " │ 𝙳𝙰𝙻𝙻\n" +
                " │ 𝙶𝙴𝙼𝙸𝙽𝙸\n" +
                " │ 𝙶𝙿𝚃\n" +
                " │ 𝙶𝚁𝙾𝚀\n" +
                " │ 𝚄𝙿𝚂𝙲𝙰𝙻𝙴\n" +
                " ╰─────────────────\n" +
                " ╭─❏ ᴀᴜᴅɪᴏ ❏\n" +
                " │ 𝙰𝚅𝙴𝙲\n" +
                " │ 𝙱𝙰𝚂𝚂\n" +
                " │ 𝙱𝙻𝙰𝙲𝙺\n" +
                " │ 𝙱𝙻𝙾𝚆𝙽\n" +
                " │ 𝙲𝚄𝚃\n" +
                " │ 𝙳𝙴𝙴𝙿\n" +
                " │ 𝙴𝙰𝚁𝚁𝙰𝙿𝙴\n" +
                " │ 𝙵𝙰𝚂𝚃\n" +
                " │ 𝙵𝙰𝚃\n" +
                " │ 𝙷𝙸𝚂𝚃𝙾\n" +
                " │ 𝙻𝙾𝚆\n" +
                " │ 𝙽𝙸𝙶𝙷𝚃𝙲𝙾𝚁𝙴\n" +
                " │ 𝙿𝙸𝚃𝙲𝙷\n" +
                " │ 𝚁𝙾𝙱𝙾𝚃\n" +
                " │ 𝚂𝙻𝙾𝚆\n" +
                " │ 𝚂𝙼𝙾𝙾𝚃𝙷\n" +
                " │ 𝚃𝚁𝙴𝙱𝙻𝙴\n" +
                " │ 𝚃𝚄𝙿𝙰𝙸\n" +
                " │ 𝚅𝙴𝙲𝚃𝙾𝚁\n" +
                " ╰─────────────────\n" +
                " ╭─❏ ᴡʜᴀᴛsᴀᴘᴘ ❏\n" +
                " │ 𝙲𝙰𝙻𝙻\n" +
                " │ 𝙲𝙰𝙿𝚃𝙸𝙾𝙽\n" +
                " │ 𝙲𝙻𝙴𝙰𝚁\n" +
                " │ 𝙲𝙾𝙽𝚃𝙰𝙲𝚃𝚂\n" +
                " │ 𝙳𝙴𝙻𝙴𝚃𝙴\n" +
                " │ 𝙳𝙻𝚃\n" +
                " │ 𝙳𝙾𝙲\n" +
                " │ 𝙾𝙽𝙻𝙸𝙽𝙴\n" +
                " │ 𝙿𝙾𝙻𝙻\n" +
                " │ 𝚁𝙴𝙰𝙳\n" +
                " │ 𝚂𝙲𝚂𝚃𝙰𝚃𝚄𝚂\n" +
                " │ 𝚂𝙴𝚃𝚂𝚃𝙰𝚃𝚄𝚂\n" +
                " │ 𝚂𝚃𝙰𝚃𝚄𝚂\n" +
                " │ 𝚅𝚅\n" +
                " ╰─────────────────";
    }

    public static void main(String[] args) {
