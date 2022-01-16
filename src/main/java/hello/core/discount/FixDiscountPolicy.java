package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements  DiscountPolicy{
    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        //enum 타입은 ==  사용
        //열거타입은 인스턴스가 고정
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else{
            return 0;
        }
    }
}
