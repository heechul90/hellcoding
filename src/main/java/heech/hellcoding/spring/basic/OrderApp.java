package heech.hellcoding.spring.basic;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.order.entity.Order;
import heech.hellcoding.spring.basic.member.service.MberService;
import heech.hellcoding.spring.basic.member.service.MberServiceImpl;
import heech.hellcoding.spring.basic.order.service.OrderService;
import heech.hellcoding.spring.basic.order.service.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MberService mberService = new MberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long mberId = 1L;
        Mber mber = new Mber(mberId, "mberA", Grade.VIP);
        mberService.join(mber);

        Order order = orderService.createOrder(mberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
