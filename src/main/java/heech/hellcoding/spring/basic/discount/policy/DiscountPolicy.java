package heech.hellcoding.spring.basic.discount.policy;

import heech.hellcoding.spring.basic.member.entity.Mber;

public interface DiscountPolicy {

    int discount(Mber mber, int price);
}
