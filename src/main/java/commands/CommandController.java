package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.HashMap;
import java.util.Map;

public class CommandController {
    private GuildMessageReceivedEvent event;
    private static final Map<String, Command> commandMap = new HashMap<>();

     static {
         commandMap.put("hello", new HelloCommand("hello"));
     }

    public CommandController(GuildMessageReceivedEvent event) {
        this.event = event;
    }

    public void executeCommand(String name, String[] args) {
         commandMap.get(name).execute(args, event);
     }
}
