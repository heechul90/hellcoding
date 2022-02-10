package heech.hellcoding.mber.discount;

import heech.hellcoding.mber.entity.Grade;
import heech.hellcoding.mber.entity.Mber;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Mber mber, int price) {
        if (mber.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
