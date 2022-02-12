package heech.hellcoding.spring.basic;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;
import heech.hellcoding.spring.basic.order.entity.Order;
import heech.hellcoding.spring.basic.member.service.MemberService;
import heech.hellcoding.spring.basic.member.service.MemberServiceImpl;
import heech.hellcoding.spring.basic.order.service.OrderService;
import heech.hellcoding.spring.basic.order.service.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.merberService();
        OrderService orderService = appConfig.orderService();

        long mberId = 1L;
        Member member = new Member(mberId, "mberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(mberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
