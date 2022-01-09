package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appconfig = new AppConfig();
        MemberService memberService = appconfig.memberService();
        OrderService orderService = appconfig.orderService();

//        MemberService memberService = new MemberServiceImpl(null);
//        OrderService orderService = new OrderServiceImpl(null);

        Long memberId = 1L;
        Member member = new Member(memberId, "jaejun", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "apple", 10000);
        System.out.println("member = " + order.toString());
    }
}
