package com.bot.echo.repository;

import com.bot.echo.entity.DriverLicenseTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseTemplateRepository extends JpaRepository<DriverLicenseTemplate, Integer> {
}
