package org.pjcloud.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.pjcloud.springcloud.entities.Payment;

/**
 * @author wanajinae
 **/

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
