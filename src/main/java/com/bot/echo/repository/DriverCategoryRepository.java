package com.bot.echo.repository;

import com.bot.echo.entity.DriverCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverCategoryRepository extends JpaRepository<DriverCategory, Integer>{
}
