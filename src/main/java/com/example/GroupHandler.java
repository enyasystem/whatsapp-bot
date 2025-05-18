import java.util.List;
import java.util.stream.Collectors;

public class GroupHandler {
    private WhatsAppApiClient apiClient;

    public GroupHandler(WhatsAppApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void tagAllMembers(String groupId, String message) {
        try {
            List<String> members = apiClient.getGroupMembers(groupId);
            String taggedMessage = createTaggedMessage(members, message);
            apiClient.sendMessage(groupId, taggedMessage);
        } catch (Exception e) {
            System.err.println("Error tagging members: " + e.getMessage());
        }
    }

    private String createTaggedMessage(List<String> members, String message) {
        String tags = members.stream()
                .map(member -> "@" + member)
                .collect(Collectors.joining(" "));
        return tags + " " + message;
    }
}