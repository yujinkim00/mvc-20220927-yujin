package DI_IoC;

//c+i implements
//c+o overrides
// interface를 구현한 클래스를 imple 지정 예정임
public class ClassBImpl1 implements ClassB {

    @Override
    public void logic1() {
        System.out.println("클래스 B1의 로직1 메소드");
    }


    @Override
    public void logic2() {
        System.out.println("클래스 B1의 로직2 메소드");
    }


    @Override
    public void logic3() {
        System.out.println("클래스 B1의 로직3 메소드");
    }
}
