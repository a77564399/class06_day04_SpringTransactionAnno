package com.day06.Dao.Impl;

import com.day06.Dao.IAccountDao;
import com.day06.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Account selectById(int id) {
        List<Account> accounts = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return accounts==null?null:accounts.get(0);

    }

    @Override
    public void updateById(Account account) {
        jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());

    }
}
