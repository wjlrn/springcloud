package org.pjcloud.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wanajinae
 **/

@Service
public class PaymentService {

    /**
     * 正常访问，肯定Ok
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_OK,id: "+ id+"\t"+"haha";
    }

    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+ id+"\t"+"haha" + " 耗时"+timeNumber+"秒钟";
    }
}
