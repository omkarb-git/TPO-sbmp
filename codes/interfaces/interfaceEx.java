// interface i {
//     void fun();
    
// }

// class interfaceEx implements i
// {
//     public void fun() 
//     {
//         System.out.println("hiii");
//     }
    
//     void ex (){
//         System.out.println("ex..");
//     }
// }

// class Ex {
//     public static void main(String args[]) 
//     {
//         interfaceEx e1 = new interfaceEx();
//         e1.fun();
//         e1.ex();
//     }
// }



//new 

// interface i1 {
//     void fun();
    
// }

// interface i2 {
//     void fun();
    
// }


// class Ex implements i1, i2{
//     public void fun() 
//     {
//         System.out.println("hiii");
//     }

//     public void fun1() {
//         System.out.println("hello");
//     }

//     public static void main(String args[]) 
//     {
//         Ex e1 = new Ex();
//         e1.fun();
//     }

// }


// new code//

interface i1 {
    void fun();
    interface i2 {
            void fun1();
            
    }   
}


class Ex implements i1, i1.i2{ // i1.i2 is used to access the nested interface i2
    public void fun() 
    {
        System.out.println("hiii");
    }

    public void fun1() {
        System.out.println("hello");
    }

    public static void main(String args[]) 
    {
        Ex e1 = new Ex();
        e1.fun();
        e1.fun1();
    }

}

