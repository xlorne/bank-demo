package com.codingapi.bankb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lorne
 * @date 2019/2/12
 * @description
 */
@RestController
public class BankController {


    @Autowired
    private BankService bankService;

    @GetMapping("/add-money")
    public String addMoney(@RequestParam("money") int money,@RequestParam("user") String user){
        return bankService.addMoney(money,user);
    }
}
