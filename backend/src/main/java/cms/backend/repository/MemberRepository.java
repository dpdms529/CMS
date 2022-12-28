package cms.backend.repository;

import cms.backend.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member find(Member member);
}
