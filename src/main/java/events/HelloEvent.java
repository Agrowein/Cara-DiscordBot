package events;

import commands.CommandController;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class HelloEvent extends ListenerAdapter {
    private CommandController commandController;
    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");
        commandController = new CommandController(event);

        commandController.executeCommand(message[0], message);
    }
}
