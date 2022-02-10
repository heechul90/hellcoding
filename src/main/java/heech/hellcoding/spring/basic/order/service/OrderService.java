package heech.hellcoding.spring.basic.order.service;

import heech.hellcoding.spring.basic.order.entity.Order;

public interface OrderService {

    Order createOrder(Long mberId, String itemName, int itemPrice);

}
