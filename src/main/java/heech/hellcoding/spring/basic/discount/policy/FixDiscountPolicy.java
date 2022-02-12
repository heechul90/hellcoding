package heech.hellcoding.spring.basic.discount.policy;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member mber, int price) {
        if (mber.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
