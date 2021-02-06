package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public abstract class Command {
    protected String name;
    protected String[] args;

    abstract void execute(String[] args, GuildMessageReceivedEvent event);
}
