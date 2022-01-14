package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService bean1 = ac.getBean(StatefulService.class);
        StatefulService bean2 = ac.getBean(StatefulService.class);
    
        //ThreadA : a 사용자가 1000원 주문
        bean1.order("appleA",1000);

        //ThreadB : b 사용자가 2000원 주문
        bean2.order("appleB",2000);
        
        //ThreadA 사용자가 주문금액 조회
        int price = bean1.getPrice();

        //공유 필드로 인해 A사용자의 금액이 B사용자의 금액으로 변경되서 나온다.
        System.out.println("price = " + price);

        Assertions.assertThat(bean1.getPrice()).isEqualTo(2000);
    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
