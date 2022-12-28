package cms.backend.service;

import cms.backend.domain.Member;
import cms.backend.repository.MemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void register(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member logIn(Member member) {
        return memberRepository.find(member);
    }

    @Override
    public void logOut() {
        // 세션 초기화
    }
}
