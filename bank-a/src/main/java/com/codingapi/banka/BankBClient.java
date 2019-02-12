package com.codingapi.banka;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lorne
 * @date 2019/2/12
 * @description
 */
@FeignClient(value = "bank-b")
public interface BankBClient {


    @GetMapping("/add-money")
    String addMoney(@RequestParam("money") int money, @RequestParam("user") String user);
}
