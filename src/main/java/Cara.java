import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Cara {
    public static void main(String[] args) {

        try {
            JDA jda = JDABuilder.createDefault(args[0]).build();
            jda.addEventListener(new HelloEvent());
        } catch (LoginException e) {
            e.printStackTrace();
        }


    }

}
