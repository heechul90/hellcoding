package heech.hellcoding.spring.basic.member.repository;

import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.member.repository.MberRepository;

import java.util.HashMap;
import java.util.Map;

public class MemoryMberRepository implements MberRepository {

    private static Map<Long, Mber> store = new HashMap<>();

    @Override
    public void save(Mber mber) {
        store.put(mber.getId(), mber);
    }

    @Override
    public Mber findById(Long mberId) {
        return store.get(mberId);
    }
}
