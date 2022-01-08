package hello.core.member;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.order.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //given
        Member member = new Member(1L, "JaeJun", Grade.VIP);

        //when
        memberService.join(member);
        Member member1 = memberService.findMember(2L);

        //then
        Assertions.assertThat(member).isEqualTo(member1);
    }
}
