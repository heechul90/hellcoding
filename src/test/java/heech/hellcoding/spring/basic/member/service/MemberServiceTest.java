package heech.hellcoding.spring.basic.member.service;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService mberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member mber = new Member(1L, "mberA", Grade.VIP);

        //when
        mberService.join(mber);
        Member findMber = mberService.findMember(1L);

        //then
        assertThat(mber).isEqualTo(findMber);
    }

}