package com.day06.Dao;

import com.day06.domain.Account;

public interface IAccountDao {
    Account selectById(int id);
    void updateById(Account account);
}
