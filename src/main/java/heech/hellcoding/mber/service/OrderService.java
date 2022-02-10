package heech.hellcoding.mber.service;

import heech.hellcoding.mber.entity.Order;

public interface OrderService {

    Order createOrder(Long mberId, String itemName, int itemPrice);

}
