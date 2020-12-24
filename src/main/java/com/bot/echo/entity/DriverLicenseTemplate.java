package com.bot.echo.entity;

import com.bot.echo.entity.DriverCategory;
import com.bot.echo.entity.Gender;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "driver_license_template")
public class DriverLicenseTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "Uid")
    private String Uid;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "date_time")
    private String dateTime;

    @Basic
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "is_finished")
    private boolean isFinished;

    @Basic
    @Column(name = "img_url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name="gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(mappedBy = "driver_categories")
    private Set<DriverCategory> driverCategoryList = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<DriverCategory> getDriverCategoryList() {
        return driverCategoryList;
    }

    public void setDriverCategoryList(Set<DriverCategory> driverCategoryList) {
        this.driverCategoryList = driverCategoryList;
    }

    @Override
    public String toString() {
        return "DriverLicenseTemplate{" +
                "id=" + id +
                ", Uid='" + Uid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateTime='" + dateTime + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", isFinished=" + isFinished +
                ", imgUrl='" + imgUrl + '\'' +
                ", user=" + user +
                ", driverCategoryList=" + driverCategoryList +
                '}';
    }
}
