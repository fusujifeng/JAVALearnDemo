public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person p1=new Person("lihua",23,"boy");
        Person p2=new Person("lihasdadsdasua",233,"boy");
        double b2=p1.doubleNum(33.2,20.1);
        System.out.println("b2");
        System.out.println(b2);
        System.out.println(p1.name);
        System.out.println(Person.info);
        System.out.println(Person.info);
        Person.info ="杰哥你干嘛";
        System.out.println("----------------");
        System.out.println(Person.info);
        System.out.println(Person.info);
        System.out.println(Person.info);
        Person.staticFunc();


    }
}