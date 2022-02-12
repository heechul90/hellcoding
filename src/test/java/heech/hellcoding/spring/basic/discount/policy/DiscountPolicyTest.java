package heech.hellcoding.spring.basic.discount.policy;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용 되어야 한다.")
    void vip_ok() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 20000);

        //then
        Assertions.assertThat(discount).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void vip_no() {
        //given
        Member member = new Member(2L, "memberB", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 20000);

        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }
}