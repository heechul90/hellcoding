package heech.hellcoding.mber.repository;

import heech.hellcoding.mber.entity.Mber;

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
