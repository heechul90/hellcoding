package heech.hellcoding.spring.basic.order.service;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;
import heech.hellcoding.spring.basic.member.service.MemberService;
import heech.hellcoding.spring.basic.member.service.MemberServiceImpl;
import heech.hellcoding.spring.basic.order.entity.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService mberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long mberId = 1L;
        Member mber = new Member(mberId, "mberA", Grade.VIP);
        mberService.join(mber);

        Order order = orderService.createOrder(mberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}