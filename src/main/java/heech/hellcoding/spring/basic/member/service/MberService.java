package heech.hellcoding.spring.basic.member.service;

import heech.hellcoding.spring.basic.member.entity.Mber;

public interface MberService {

    void join(Mber mber);

    Mber findMber(Long mberId);
}
