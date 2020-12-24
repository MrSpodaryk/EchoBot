package com.bot.echo.service;

import com.bot.echo.repository.DriverCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverCategoryService {

    @Autowired
    DriverCategoryRepository driverCategoryRepository;
}
