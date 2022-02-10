package heech.hellcoding.mber;

import heech.hellcoding.mber.entity.Grade;
import heech.hellcoding.mber.entity.Mber;
import heech.hellcoding.mber.service.MberService;
import heech.hellcoding.mber.service.MberServiceImpl;

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
