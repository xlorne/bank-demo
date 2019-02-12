package com.codingapi.banka;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
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

    @Autowired
    private BankBClient bankBClient;

    @LcnTransaction
    @Transactional
    public String start(int money) {

        String user = "xiaoming";

        String state = bankBClient.addMoney(money,user);
        if("success".equals(state)){
            Account account = new Account();
            account.setMoney(money);
            account.setUser(user);
            int res = accountDao.update(account);

            throw new RuntimeException("error runtime.");

//            return res>0?"success":"error";
        }
        return "rpc error";
    }

}
