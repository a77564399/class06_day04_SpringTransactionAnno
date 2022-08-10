package com.day06.Service.Impl;

import com.day06.Dao.IAccountDao;
import com.day06.Service.IAccountService;
import com.day06.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountService implements IAccountService {
    @Autowired
    IAccountDao iAccountDao;
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void transfer(int id1, int id2, Double money) {
        Account account1 = iAccountDao.selectById(id1);
        Account account2 = iAccountDao.selectById(id2);
        account1.setMoney(account1.getMoney()-money);
//        int i = 1/0;
        account2.setMoney(account2.getMoney()+money);
        iAccountDao.updateById(account1);
        iAccountDao.updateById(account2);
    }
}
