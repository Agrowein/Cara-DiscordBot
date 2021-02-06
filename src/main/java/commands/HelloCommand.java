package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class HelloCommand extends Command {
    public HelloCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute(String[] args, GuildMessageReceivedEvent event) {
        event.getChannel().sendMessage("Вечер в хату").queue();
    }
}
