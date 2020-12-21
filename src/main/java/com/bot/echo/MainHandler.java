package com.bot.echo;

import com.botscrew.botframework.annotation.ChatEventsProcessor;
import com.botscrew.botframework.annotation.Text;
import com.botscrew.messengercdk.model.MessengerUser;
import com.botscrew.messengercdk.model.outgoing.builder.TextMessage;
import com.botscrew.messengercdk.service.Messenger;
import com.botscrew.messengercdk.service.Sender;
import org.springframework.beans.factory.annotation.Autowired;

@ChatEventsProcessor
public class MainHandler {

    private final Sender sender;
    private final Messenger messenger;

    @Autowired
    public MainHandler(Sender sender, Messenger messenger) {
        this.sender = sender;
        this.messenger = messenger;
    }

    @Text(states = {"default"})
    public void handleText(MessengerUser user, @Text String text) {
        String name = messenger.getProfile(user.getChatId()).getFirstName();
        String message1 = "Hi " + name + "!";
        String message2 = "you tipped "+ text;
        sender.send(user, message1);
        sender.send(
                TextMessage.builder()
                        .user(user)
                        .text(message2)
                        .build());
    }
}