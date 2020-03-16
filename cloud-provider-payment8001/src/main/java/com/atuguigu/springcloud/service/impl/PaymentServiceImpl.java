package com.atuguigu.springcloud.service.impl;

import com.atuguigu.springcloud.dao.PaymentDao;
import com.atuguigu.springcloud.entities.Payment;
import com.atuguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SuWenYuan
 * @create 2020/03/15 20:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
