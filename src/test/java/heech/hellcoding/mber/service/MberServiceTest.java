package heech.hellcoding.mber.service;

import heech.hellcoding.mber.entity.Grade;
import heech.hellcoding.mber.entity.Mber;
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