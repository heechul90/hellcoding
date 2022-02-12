package heech.hellcoding.spring.basic.member.service;

import heech.hellcoding.spring.basic.member.entity.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
