package heech.hellcoding.spring.basic.order.service;

import heech.hellcoding.spring.basic.discount.policy.DiscountPolicy;
import heech.hellcoding.spring.basic.discount.policy.FixDiscountPolicy;
import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.order.entity.Order;
import heech.hellcoding.spring.basic.member.repository.MberRepository;
import heech.hellcoding.spring.basic.member.repository.MemoryMberRepository;

public class OrderServiceImpl implements OrderService {

    private final MberRepository mberRepository = new MemoryMberRepository();

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long mberId, String itemName, int itemPrice) {
        Mber mber = mberRepository.findById(mberId);
        int discountPrice = discountPolicy.discount(mber, itemPrice);

        return new Order(mberId, itemName, itemPrice, discountPrice);
    }
}
