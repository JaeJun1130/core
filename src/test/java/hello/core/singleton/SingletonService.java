package hello.core.singleton;

public class SingletonService {
    //자바가 실행되는 순간 static 영역에 SingletonService 객체를 생성해서 자기자신 instance 가 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return  instance;
    }

    //private 생성자를 통해 자기자신밖에 생성못하게 막음
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
