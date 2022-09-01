package hello.core.singleton;

public class SingletonServiceTest {

    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonServiceTest instance = new SingletonServiceTest();


    //2. public으로 열어서 이 static 메서드로만 조회할 수 있게 한다.
    public static SingletonServiceTest getInstance() {
        return instance;
    }

    //3. 다른 곳에서 new 키워드로 객체를 생성하지 못하게 한다.
    private SingletonServiceTest() {

    }

    public static void main(String[] args) {
        SingletonServiceTest singletonServiceTest = new SingletonServiceTest();
    }
}
