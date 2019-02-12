package com.codingapi.banka;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author lorne
 * @date 2019/2/12
 * @description
 */
@Mapper
public interface AccountDao {


    @Update("update t_bank set money = money-#{money} where user = #{user}")
    int update(Account account);

}
