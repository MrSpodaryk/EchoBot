package com.bot.echo.service;

import com.bot.echo.repository.DriverLicenseTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverLicenseTemplateService {

    @Autowired
    DriverLicenseTemplateRepository driverLicenseTemplateRepository;
}
