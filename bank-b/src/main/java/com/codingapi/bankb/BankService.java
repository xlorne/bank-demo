package com.codingapi.bankb;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lorne
 * @date 2019/2/12
 * @description
 */
@Component
public class BankService {

    @Autowired
    private AccountDao accountDao;

    @TxcTransaction
    @Transactional
    public String addMoney(int money, String user) {
        Account account = new Account();
        account.setMoney(money);
        account.setUser(user);
        int res =  accountDao.update(account);
        return res>0?"success":"error";
    }
}
