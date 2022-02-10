package heech.hellcoding.spring.basic;

import heech.hellcoding.spring.basic.member.entity.Grade;
import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.member.service.MberService;
import heech.hellcoding.spring.basic.member.service.MberServiceImpl;

public class MberApp {

    public static void main(String[] args) {
        MberService mberService = new MberServiceImpl();
        Mber mber = new Mber(1L, "mberA", Grade.VIP);
        mberService.join(mber);

        Mber findMber = mberService.findMber(1L);
        System.out.println("new mber = " + mber.getName());
        System.out.println("find mber = " + findMber.getName());
    }
}
