package heech.hellcoding.mber.service;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.member.service.MberService;
import heech.hellcoding.spring.basic.member.service.MberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MberServiceTest {

    MberService mberService = new MberServiceImpl();

    @Test
    void join() {
        //given
        Mber mber = new Mber(1L, "mberA", Grade.VIP);

        //when
        mberService.join(mber);
        Mber findMber = mberService.findMber(1L);

        //then
        assertThat(mber).isEqualTo(findMber);
    }

}