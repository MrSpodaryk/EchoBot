package com.bot.echo.interceptor;

import com.botscrew.messengercdk.domain.MessengerInterceptor;
import com.botscrew.messengercdk.domain.action.GetEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MainInterceptor implements MessengerInterceptor<GetEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainInterceptor.class);

    @Override
    public boolean onAction(GetEvent getEvent) {
        LOGGER.info(getEvent.toString());
        return false;
    }
}
