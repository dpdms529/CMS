package cms.backend;

import cms.backend.repository.MemoryMemberRepository;
import cms.backend.service.MemberService;
import cms.backend.service.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
