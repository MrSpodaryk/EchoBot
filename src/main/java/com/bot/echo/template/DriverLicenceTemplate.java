package com.bot.echo.template;

import com.bot.echo.enums.Gender;

import java.util.List;

public class DriverLicenceTemplate {

    private String firstName;
    private String lastName;
    private List<String> driverCategoryList;
    private Gender sex;
    private String dateTime;
    private String dateOfBirth;
    private String email;
    private String id;
    private boolean isFinish;
    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getDriverCategoryList() {
        return driverCategoryList;
    }

    public void setDriverCategoryList(List<String> driverCategoryList) {
        this.driverCategoryList = driverCategoryList;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DriverLicenceTemplate{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driverCategoryList=" + driverCategoryList +
                ", sex='" + sex + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", isFinish='" + isFinish + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
