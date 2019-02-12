package com.codingapi.banka;

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

    @GetMapping("/start")
    public String start(@RequestParam("money") int money){
        return bankService.start(money);
    }
}
