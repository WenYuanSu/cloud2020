package com.atuguigu.springcloud.dao;

import com.atuguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author SuWenYuan
 * @create 2020/03/15 20:01
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);
}
