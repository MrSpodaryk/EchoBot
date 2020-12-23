package com.bot.echo.service.impl;

import com.bot.echo.service.UserService;
import com.bot.echo.entity.User;
import com.botscrew.messengercdk.model.MessengerUser;
import com.botscrew.messengercdk.service.Messenger;
import com.botscrew.messengercdk.service.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserProvider {

    private final Messenger messenger;
    private final User user;

    @Autowired
    public UserServiceImpl(Messenger messenger) {
        this.messenger = messenger;
        this.user = new User();
        user.setState("default");
    }

    @Override
    public User createIfNotExist(Long chatId) {
        return user;
    }
    @Override
    public void changeState(User user, String chatState) {
        user.setState(chatState);
    }

    @Override
    public Boolean checkState(User user, String message) {
        return null;
    }

    @Override
    public MessengerUser getByChatIdAndPageId(Long chatId, Long pageId) {
        return user;
    }
}
