package heech.hellcoding.mber;

import heech.hellcoding.mber.entity.Grade;
import heech.hellcoding.mber.entity.Mber;
import heech.hellcoding.mber.entity.Order;
import heech.hellcoding.mber.service.MberService;
import heech.hellcoding.mber.service.MberServiceImpl;
import heech.hellcoding.mber.service.OrderService;
import heech.hellcoding.mber.service.OrderServiceImpl;

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
