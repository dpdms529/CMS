package cms.backend.service;

import cms.backend.domain.Member;

public interface MemberService {

    void register(Member member);

    Member logIn(Member member);

    void logOut();
}
