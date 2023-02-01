import java.util.Locale;

interface Parser{
    String parse(String str);
}
class StringParser{
    //public static String convert(String s){  // while using static method we candirectly use the class to call the method
    public String convert(String s){
        if(s.length()>=3)
            s= s.toUpperCase();
        else
            s= s.toLowerCase();
        return s;
    }
}
class MyPrinter{
    public void print(String str, Parser p){
        str = p.parse(str);
        System.out.println("str = " + str);
    }
}


public class DemoMethodRefFirst {
    public static void main(String[] args) {
        StringParser sp = new StringParser();
        String str = "JP";
        MyPrinter myPrinter = new MyPrinter();
        //myPrinter.print(str,StringParser::convert); //can directly call with classname as the method was Static
        myPrinter.print(str,sp::convert); //create an object and call the method
    }
}
