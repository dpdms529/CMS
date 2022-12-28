package cms.backend.repository;

import cms.backend.domain.Member;

public class MemoryMemberRepository implements MemberRepository {

    private static Member store;

    @Override
    public void save(Member member) {
        store = member;
    }

    @Override
    public Member find(Member member) {
        return store;
    }
}
