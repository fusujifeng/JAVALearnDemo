public class Person {
    String name ="wasicong";
    int age;
    String sex;
    static String info="info你干嘛";


    public void setAge(int age) {
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello World");
        System.out.println("i am "+name);
    }
    void changeName(String name) {
        this.name=name;
        System.out.println("i am "+name);
    }

    int doubleNum(int a, int b){
        return (a+b)*2;
    }
    double doubleNum(double a, double b){
        return (a+b)*2;
    }

    Person(String name,int age,String sex){
     this.name=name;
     this.age=age;
     this.sex=sex;
    }

    static void staticFunc(){
        System.out.println("我是静态方法");
    }
}
