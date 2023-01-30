interface A{
    void show(int i);
}
public class DemoLambda {
    public static void main(String[] args) {
        A obj;
//        obj = new A()
//        {
//            @Override
//            public void show(int i) {
//                System.out.println(" Hello"+i);
//            }
//        };
        obj = i -> System.out.println(" Hello "+i);
        obj.show(4);

    }
}
