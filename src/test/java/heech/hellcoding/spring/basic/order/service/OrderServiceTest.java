package heech.hellcoding.spring.basic.order.service;

import heech.hellcoding.spring.basic.AppConfig;
import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;
import heech.hellcoding.spring.basic.member.service.MemberService;
import heech.hellcoding.spring.basic.member.service.MemberServiceImpl;
import heech.hellcoding.spring.basic.order.entity.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService= appConfig.merberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}