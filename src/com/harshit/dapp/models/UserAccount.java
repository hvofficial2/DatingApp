package com.harshit.dapp.models;

import java.util.Objects;

public class UserAccount {
    private int id;
    private String userName;
    private String password;
    private int age;
    private String email;
    private long phoneNumber;
    private String gender;
    private String city;
    private String country;
    private Interest interest;

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", interest=" + interest +
                '}';
    }

    public int hashCode(){
        return Objects.hash(id);
    }

    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o instanceof UserAccount){
            UserAccount ua = (UserAccount) o;
            if(id == ua.id)
                return true;
            return false;
        }
        return false;
    }
}
