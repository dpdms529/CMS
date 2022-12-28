package cms.backend.member;

import cms.backend.AppConfig;
import cms.backend.domain.Member;
import cms.backend.service.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void register() {
        // given
        Member member = new Member("2018", "hello", "pwd", null, null);

        // when
        memberService.register(member);
        Member findMember = memberService.logIn(member);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void logIn() {
        // given
        Member member1 = new Member("2018", "hello", "pwd", null, null);
        Member member2 = new Member("2018", "hello", "pwd", null, null);

        // when
        memberService.register(member1);
        Member findMember = memberService.logIn(member1);

        // then
        Assertions.assertThat(member1).isEqualTo(findMember);
    }
}
