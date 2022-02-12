package heech.hellcoding.spring.basic;

import heech.hellcoding.spring.basic.discount.policy.FixDiscountPolicy;
import heech.hellcoding.spring.basic.member.repository.MemoryMemberRepository;
import heech.hellcoding.spring.basic.member.service.MemberService;
import heech.hellcoding.spring.basic.member.service.MemberServiceImpl;
import heech.hellcoding.spring.basic.order.service.OrderService;
import heech.hellcoding.spring.basic.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService merberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
