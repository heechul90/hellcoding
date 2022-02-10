package heech.hellcoding.spring.basic.member.service;

import heech.hellcoding.spring.basic.member.entity.Mber;
import heech.hellcoding.spring.basic.member.repository.MberRepository;
import heech.hellcoding.spring.basic.member.repository.MemoryMberRepository;

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
