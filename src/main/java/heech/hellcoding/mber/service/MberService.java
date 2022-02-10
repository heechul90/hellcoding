package heech.hellcoding.mber.service;

import heech.hellcoding.mber.entity.Mber;

public interface MberService {

    void join(Mber mber);

    Mber findMber(Long mberId);
}
