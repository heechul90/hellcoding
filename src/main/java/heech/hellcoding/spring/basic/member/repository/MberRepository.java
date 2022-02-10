package heech.hellcoding.spring.basic.member.repository;

import heech.hellcoding.spring.basic.member.entity.Mber;

public interface MberRepository {

    void save(Mber mber);

    Mber findById(Long mberId);
}
