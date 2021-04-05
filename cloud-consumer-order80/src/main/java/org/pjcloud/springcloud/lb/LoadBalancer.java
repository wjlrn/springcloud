package org.pjcloud.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author wanajinae
 **/

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
