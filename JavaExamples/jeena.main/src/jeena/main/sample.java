package jeena.main;

import jeena.util.Calculator;

public class sample {
    public static void main(String[] args) {
        System.out.println("Hello");
        Calculator cal = new Calculator();
        System.out.println( cal.add(3,7));
        System.out.println( cal.add(6.3,7.8));
    }
}
