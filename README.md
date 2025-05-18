# WhatsApp Bot

This project is a WhatsApp bot developed in Java that can tag all members of a group. The bot is designed to interact with the WhatsApp API and manage group interactions effectively.

## Features

- Tag all members of a WhatsApp group in a single message.
- Handle group commands to trigger the tagging functionality.
- Interact with the WhatsApp API to send messages and retrieve group member information.
- Provide error handling and feedback to users.

## Project Structure

```
whatsapp-bot
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── WhatsAppBot.java
│   │   │           ├── GroupHandler.java
│   │   │           ├── CommandProcessor.java
│   │   │           └── api
│   │   │               └── WhatsAppApiClient.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd whatsapp-bot
   ```

3. Update the `application.properties` file with your WhatsApp API credentials and group IDs.

4. Build the project using Maven:
   ```
   mvn clean install
   ```

5. Run the bot:
   ```
   mvn exec:java -Dexec.mainClass="com.example.WhatsAppBot"
   ```

## Usage Guidelines

- To tag all members of a group, use the command `/tag` in the group chat.
- The bot will respond with a message mentioning each member of the group.

## Error Handling

The bot includes error handling mechanisms to provide feedback in case of issues, such as:

- Invalid commands
- API errors
- Network issues

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.