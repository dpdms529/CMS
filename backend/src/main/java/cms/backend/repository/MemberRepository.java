package cms.backend.repository;

import cms.backend.domain.Member;

public interface StudentRepository {

    void save(Member member);

    Member find(Member member);
}
