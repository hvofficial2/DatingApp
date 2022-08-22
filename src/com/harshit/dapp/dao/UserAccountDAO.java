package com.harshit.dapp.dao;

import com.harshit.dapp.models.UserAccount;
import java.util.List;

public interface UserAccountDAO {
    void save(UserAccount ua);

    UserAccount findById(int id);

    void delete(int id);

    List<UserAccount> findAll();

    List<UserAccount> findMatches(int age,String city);
}
