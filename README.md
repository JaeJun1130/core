# 스프링 핵심 원리 - 기본편 실습
### 좋은 객체지향 프로그래밍 개발 연습
> SRP 단일 책임 원침
> -  한 클래스는 하나의 책임만 가져아한다.

> DIP 의존관계 역전 원칙
> - 프로그래머는 추상화에 의존해야지, 구체화에 의존하면 안된다.
> - 의성 주입은 이 원칙을 따르는 방법 중 하나.
> - 제 3의 대상이 객체를 생성해주고 객체의 레퍼런스를 주입 해줘야함.


> OCP 개방-폐쇄 원칙
> - 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
> - DIP, SRP, 다형성으로 인해 확장헤는 열려 있으나 클라이언트의 변경에는 닫혀 있다.
> - 소프트웨어 요소를 새롭게 확장해도 사용 영역의 변경은 닫혀 있다.

> IOC 제어의 역전
> - 프로그램에 대한 제어 흐름은 모두 제 3의 대상이 설정한다.
> - 외부에서 관리하는 것을 제어의 역전 이라 한다.

> 프레임워크 / 라이브러
> - 내가 작성한 코드를 제어하고, 대신 실행해주면 그것은 프레임워크가 맞다.ex)Junit
> - 내가 작성한 코드가 직접 제어의 흐름을 담당한다면 그건 라이브러리.리 ex)main method

> 정적 클래스 의존관게
> - import 코드만 보고 의존관계를 쉽게 판단할 수 있다. 
> - 애플리케이션을 실행 하지 않아도 분석할 수 있다.
> - 이 정보 만으로는 어떤 객체가 주입 될지 알 수 없다.

> 동적 객체 인스턴스 의존관계
> - 애플리케이션 실행 시점에 생성된 객체 인스턴스(주소값)의 참조가 연결된 의존관계.

> DI 의존관계 주입
> - 어떠한 구현 객체가 사용될지는 모른다.
> - 애플리케이션 실행 시점에 외부에서 실제 구현 객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버의 실제 의존관계가 연결 되는 것을 의존관계 주입이라고 한다.
> - 정적인 그림을 바꿀 필요 없이, 동적 부분만 수정해서 의존관계를 쉽게 수정 할 수 있다.