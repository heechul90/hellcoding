package heech.hellcoding;

import heech.hellcoding.member.repository.MemberRepository;
import heech.hellcoding.member.repository.MemoryMemberRepository;
import heech.hellcoding.member.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
