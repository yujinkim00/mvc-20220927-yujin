package DI_IoC;

public class ClassBImpl2 implements ClassB{

    public ClassBImpl2() {
        super();
        ClassBImpl2 = new ClassBImpl2();
    }

    @Override
    public void logic1() {
        System.out.println("클래스 B2의 로직1 메소드");
        ClassBImpl2.logic1();
    }



    @Override
    public void logic2() {
        System.out.println("클래스 B2의 로직2 메소드");
        ClassBImpl2.logic2();
    }


    @Override
    public void logic3() {
        System.out.println("클래스 B2의 로직3 메소드");
        ClassBImpl2.logic3();
    }
}
