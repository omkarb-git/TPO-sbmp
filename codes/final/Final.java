// public class Final {
//     final int a;
//      Final() {
//         a = 10; // final variable can be initialized in constructor
//     }
//     public static void main(String[] args) {
//         final Final el = new Final();
//         System.out.println(el.a); // it will print 10
//     }
// }

public class Final {

    final int a;
    Final() {
        a = 10; // final variable can be initialized in constructor
    }
    Final(int x) {
       // a = x; // final variable can be initialized in constructor
       this();
    }
    public static void main(String[] args) {
        Final el = new Final();
        Final el2 = new Final(20);

        System.out.println(el.a); // it will print 10
        System.out.println(el2.a); // it will print 20
    }

}

