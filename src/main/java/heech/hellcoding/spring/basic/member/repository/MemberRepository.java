package heech.hellcoding.spring.basic.member.repository;

import heech.hellcoding.spring.basic.member.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
