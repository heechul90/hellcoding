package heech.hellcoding.mber.repository;

import heech.hellcoding.mber.entity.Mber;

public interface MberRepository {

    void save(Mber mber);

    Mber findById(Long mberId);
}
