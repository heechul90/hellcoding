package heech.hellcoding.mber.service;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.order.entity.Order;
import heech.hellcoding.spring.basic.member.service.MberService;
import heech.hellcoding.spring.basic.member.service.MberServiceImpl;
import heech.hellcoding.spring.basic.order.service.OrderService;
import heech.hellcoding.spring.basic.order.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    MberService mberService = new MberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long mberId = 1L;
        Mber mber = new Mber(mberId, "mberA", Grade.VIP);
        mberService.join(mber);

        Order order = orderService.createOrder(mberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}