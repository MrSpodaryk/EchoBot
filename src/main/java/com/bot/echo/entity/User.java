package com.bot.echo.entity;


import com.botscrew.messengercdk.model.MessengerUser;
import java.time.LocalDateTime;

public class User implements MessengerUser {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Long getChatId() {
        return 3863777143635265L;
    }

    @Override
    public String getState() {
        return state;
    }
}
