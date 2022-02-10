package heech.hellcoding.mber.service;

import heech.hellcoding.mber.entity.Grade;
import heech.hellcoding.mber.entity.Mber;
import heech.hellcoding.mber.entity.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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