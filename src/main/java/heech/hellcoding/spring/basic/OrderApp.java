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
        MemberService mberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long mberId = 1L;
        Member mber = new Member(mberId, "mberA", Grade.VIP);
        mberService.join(mber);

        Order order = orderService.createOrder(mberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
