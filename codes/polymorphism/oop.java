// // class Test {
// //     void add(int a, int  b) {
// //         int c = a + b;
// //         System.out.println("addition of two numbers is: " + c);
// //     }

// //     void add(int a, int b, int c) {
// //         int d = a + b + c;
// //         System.out.println("addition of three numbers is: " + d);
// //     }
// // }

// // public class oop {
// //     public static void main(String[] args) {
// //         Test t1 = new Test();
// //         t1.add(10, 20);
// //         t1.add(10, 20, 30);
// //     }
// // }



// // new//

// class Test
// {
//     Test()
//     {
//         System.out.println("constructor");
//     }

//     Test(int a)
//     {
//         System.out.println("parameterized constructor");
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         Test t2 = new Test(10);
//     }
// }


// class Test {
//     void add(int a, int  b) {
//         int c = a + b;
//         System.out.println("addition of two numbers is: " + c);
//     }

//     void add(int a, int b, int c) {
//         int d = a + b + c;
//         System.out.println("addition of three numbers is: " + d);
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.add(10, 20);
//         t1.add(10, 20, 30);
//     }
// }



// new//

class parent
{
    void car()
    {
        System.out.println("maruti");
    }

}
class child extends parent
{
    void car()
    {
        System.out.println("BMW");
    }
}

public class oop {
    public static void main(String[] args) {
        parent p1 = new parent();
        child c1 = new child();
        p1.car();
        c1.car();
    }
}

