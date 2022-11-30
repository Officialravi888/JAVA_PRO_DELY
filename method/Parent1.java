public class Parent1 {
    void fun() {
        System.out.println("Parent");
        ;
    }
}
class Parent2{
    void fun(){
        System.out.println("parent2");
    }
}
class Test extends Parent1 Parent2{
    public static void main(String[] args) {
        Test t =new Test();
        t.fun();
    }
}
