package heech.hellcoding.mber.discount;

import heech.hellcoding.mber.entity.Mber;

public interface DiscountPolicy {

    int discount(Mber mber, int price);
}
