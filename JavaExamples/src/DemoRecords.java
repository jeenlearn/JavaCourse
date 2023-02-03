public class DemoRecords {
    record Person(String name, String email,int phoneNumber){}
    public static void main(String[] args) {
        Person person = new Person("Jeena","jeena@gmail.com",123343535);
        System.out.println(person);
    }
}
