//package com.bot.echo.service.impl;
//
//import com.bot.echo.constant.ChatState;
//import com.bot.echo.entity.User;
//import com.bot.echo.repository.UserRepository;
//import com.bot.echo.service.UserService;
//import com.botscrew.messengercdk.model.MessengerUser;
//import com.botscrew.messengercdk.model.incomming.Profile;
//import com.botscrew.messengercdk.service.Messenger;
//import com.botscrew.messengercdk.service.UserProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService, UserProvider {
//    private static final String MALE = "male";
//    private static final String FEMALE = "female";
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private Messenger messenger;
//
//    @Override
//    public User createIfNotExist(Long chatId) {
//        User user = userRepository.findByChatId(chatId);
//        if (user == null) {
//            user = new User();
//            user.setChatId(chatId);
//            Profile profileInfo = messenger.getProfile(chatId);
//            user.setFirstName(profileInfo.getFirstName());
//            user.setLastName(profileInfo.getLastName());
//            user.setState(ChatState.WELCOME);
//            userRepository.save(user);
//        }
//        return user;
//    }
//
//    @Override
//    public void changeState(User user, String chatState) {
//        user.setState(chatState);
//        userRepository.save(user);
//    }
//
//    @Override
//    public User findByChatId(Long userChatId) {
//        return userRepository.findByChatId(userChatId);
//    }
//
//    @Override
//    public void save(User user) {
//        userRepository.save(user);
//    }
//
//    @Override
//    public Boolean checkState(User user, String message) {
//        return message.equalsIgnoreCase("stop");
//    }
//
//    @Override
//    public MessengerUser getByChatIdAndPageId(Long chatId, Long pageId) {
//        return createIfNotExist(chatId);
//    }
//}
