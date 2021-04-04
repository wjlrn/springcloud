package org.pjcloud.springcloud.service.impl;


import org.pjcloud.springcloud.dao.PaymentDao;
import org.pjcloud.springcloud.entities.Payment;
import org.pjcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wanajinae
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
