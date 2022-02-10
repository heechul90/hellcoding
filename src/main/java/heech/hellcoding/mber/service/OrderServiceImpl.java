package heech.hellcoding.mber.service;

import heech.hellcoding.mber.discount.DiscountPolicy;
import heech.hellcoding.mber.discount.FixDiscountPolicy;
import heech.hellcoding.mber.entity.Mber;
import heech.hellcoding.mber.entity.Order;
import heech.hellcoding.mber.repository.MberRepository;
import heech.hellcoding.mber.repository.MemoryMberRepository;

public class OrderServiceImpl implements OrderService{

    private final MberRepository mberRepository = new MemoryMberRepository();

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long mberId, String itemName, int itemPrice) {
        Mber mber = mberRepository.findById(mberId);
        int discountPrice = discountPolicy.discount(mber, itemPrice);

        return new Order(mberId, itemName, itemPrice, discountPrice);
    }
}
