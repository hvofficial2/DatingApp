package com.harshit.dapp.controllers;

import com.harshit.dapp.dao.UserAccountDAO;
import com.harshit.dapp.dao.UserAccountDAOImpl;
import com.harshit.dapp.models.Interest;
import com.harshit.dapp.models.UserAccount;
import java.util.Scanner;

public class UserAccountController {
    static int idcount=101;
    static Scanner sc = new Scanner(System.in);
    static UserAccountDAO dao = new UserAccountDAOImpl();
    public static void main(String...args){
        UserAccountController uac = new UserAccountController();

        UserAccount ua = new UserAccount();
        ua.setId(idcount);
        ua.setUserName("Harshit");
        ua.setPassword("Password1");
        ua.setAge(25);
        ua.setEmail("sdjgad@khs.vom");
        ua.setPhoneNumber(698797894);
        ua.setGender("Male");
        ua.setCity("Moradabad");
        ua.setCountry("India");
        Interest interest = new Interest();
        interest.setId(idcount);
        interest.setLikes("sdd");
        interest.setDislikes("sdd");
        interest.setHobbies("fjshdfs");
        interest.setProfileURL("hdkajhdkd");
        interest.setAbout("shdjhgd");
        ua.setInterest(interest);
        dao.save(ua);
        idcount++;

        UserAccount ua2 = new UserAccount();
        ua2.setId(idcount);
        ua2.setUserName("Harshit");
        ua2.setPassword("Password1");
        ua2.setAge(25);
        ua2.setEmail("sdjgad@khs.vom");
        ua2.setPhoneNumber(698797894);
        ua2.setGender("Male");
        ua2.setCity("Moradabad");
        ua2.setCountry("India");
        Interest interest2 = new Interest();
        interest2.setId(idcount);
        interest2.setLikes("sdd");
        interest2.setDislikes("sdd");
        interest2.setHobbies("fjshdfs");
        interest2.setProfileURL("hdkajhdkd");
        interest2.setAbout("shdjhgd");
        ua2.setInterest(interest2);
        dao.save(ua2);
        idcount++;

        uac.findAllUsers();
        uac.delete(101);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        uac.findAllUsers();

        uac.find(102);

//        while(true){
//            uac.registerUser();
//            System.out.println("Enter 1 to again enter a new user");
//            System.out.println("Enter 2 to Stop");
//            if(sc.nextInt()==2)
//                break;
//            else
//                sc.nextLine();
//        }

    }

    public void registerUser(){
//        UserAccount ua = new UserAccount();
//        ua.setId(idcount);
//        System.out.println("#------------WELCOME------------#");
//        System.out.print("Please enter Username     :   ");
//        ua.setUserName(sc.nextLine());
//        System.out.print("Please enter password     :   ");
//        ua.setPassword(sc.nextLine());
//        System.out.print("Please enter Age          :   ");
//        ua.setAge(sc.nextInt());
//        System.out.print("Please enter email        :   ");
//        ua.setEmail(sc.next());
//        System.out.print("Please enter PhoneNo.     :   ");
//        ua.setPhoneNumber(sc.nextLong());
//        System.out.print("Please enter Gender       :   ");
//        ua.setGender(sc.next());sc.nextLine();
//        System.out.print("Please enter City         :   ");
//        ua.setCity(sc.nextLine());
//        System.out.print("Please enter Country      :   ");
//        ua.setCountry(sc.nextLine());
//
//        Interest interest = new Interest();
//        interest.setId(idcount);
//        System.out.print("Please enter like             :   ");
//        interest.setLikes(sc.nextLine());
//        System.out.print("Please enter Dislike          :   ");
//        interest.setDislikes(sc.nextLine());
//        System.out.print("Please enter Hobbies          :   ");
//        interest.setHobbies(sc.nextLine());
//        System.out.print("Please enter profileURL       :   ");
//        interest.setProfileURL(sc.nextLine());
//        System.out.print("Please enter about info.      :   ");
//        interest.setAbout(sc.nextLine());
//
//        ua.setInterest(interest);
//        dao.save(ua);
//        System.out.println(dao.findById(idcount));
//        idcount++;
    }

    public void findAllUsers(){
        System.out.println(dao.findAll());
    }

    public void delete(int id){
        dao.delete(id);
    }

    public void find(int id){
        System.out.println(dao.findById(id));
    }
}
