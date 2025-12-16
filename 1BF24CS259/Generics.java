class A<T>{
    T a;
    public A(T a){
        this.a = a;
    }
    void set(){
        System.out.println(a);
    }
}
public class Generics {
    public static void main(String[] args) {
        A<Integer> a = new A<Integer>(8);
        A<String> b = new A<String>("apple");
        a.set();
        b.set();
    }
}
