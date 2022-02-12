package heech.hellcoding.spring.basic.discount.policy;

import heech.hellcoding.spring.basic.member.entity.Member;

public interface DiscountPolicy {

    int discount(Member mber, int price);
}
