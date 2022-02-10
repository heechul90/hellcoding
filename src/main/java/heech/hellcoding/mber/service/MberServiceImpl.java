package heech.hellcoding.mber.service;

import heech.hellcoding.mber.entity.Mber;
import heech.hellcoding.mber.repository.MberRepository;
import heech.hellcoding.mber.repository.MemoryMberRepository;

public class MberServiceImpl implements MberService {

    private final MberRepository mberRepository = new MemoryMberRepository();

    @Override
    public void join(Mber mber) {
        mberRepository.save(mber);
    }

    @Override
    public Mber findMber(Long mberId) {
        return mberRepository.findById(mberId);
    }
}
