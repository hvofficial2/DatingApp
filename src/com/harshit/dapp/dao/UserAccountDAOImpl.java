package com.harshit.dapp.dao;

import com.harshit.dapp.models.UserAccount;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class UserAccountDAOImpl implements UserAccountDAO{
    Map<Integer,UserAccount> userAccounts = new HashMap<>();

    @Override
    public void save(UserAccount ua){
        userAccounts.put(ua.getId(),ua);
    }

    @Override
    public UserAccount findById(int id){
           return userAccounts.get(id);
    }

    @Override
    public void delete(int id){
        userAccounts.remove(id);
    }

    @Override
    public List<UserAccount> findAll(){
        return (new ArrayList<>(userAccounts.values()));
    }

    @Override
    public List<UserAccount> findMatches(int age,String city){
        List<UserAccount> matches = new ArrayList<>();
        List<UserAccount> all = findAll();
        for (UserAccount ua: all)
            if(ua.getAge()==age && ua.getCity().equalsIgnoreCase(city))
                matches.add(ua);
        return matches;
    }
}
