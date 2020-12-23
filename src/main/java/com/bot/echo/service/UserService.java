package com.bot.echo.service;

import com.bot.echo.entity.User;

public interface UserService {
    User createIfNotExist(Long chatId);

    void changeState(User user, String chatState);

    Boolean checkState(User user, String message);
}