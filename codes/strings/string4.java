// // class string4{
// //     public static void main(String[] args) {
// //         String s1 = "";
// //         String s2 = "ABC";  
// //         String s3 = " ";                                 
        
// //         System.out.println(s1.isEmpty());       //returns true because s1 is empty
// //         System.out.println(s2.isEmpty());       //returns false because s2 is not empty
// //         System.out.println(s3.isEmpty());       //returns false because s3 is not empty

// //         System.out.println(s1.isBlank());       //returns true because s1 is empty
// //         System.out.println(s2.isBlank());       //returns false because s2 is not empty
// //         System.out.println(s3.isBlank());       //returns false because s3 is not empty
// //     }
// // }


// class string4{
//     public static void main(String[] args) {
//         String s1 = "  omkar   ";   
//         String   s2 = "heLLo stUDEnts";    
//         String s3 = "omkar";                         
//         String s4 = "Hi hi hi hi hiiiii welcome";

//         System.out.println(s1.trim());       //returns "omkar" because it removes leading and trailing whitespace
//         System.out.println(s2.toLowerCase());       //returns "hello students" because it converts all characters to lowercase
//         System.out.println(s2.toUpperCase());       //returns "HELLO STUDENTS" because it converts all characters to uppercase
//         System.out.println(s3.replace('a', '@'));       //returns "omk@r" because it replaces all occurrences of 'a' with '@'
//         System.out.println(s4.replace("hi", "Hello"));       //returns "Hi Hello Hello Hello Helloiiii welcome" because it replaces all occurrences of "hi" with "Hello"
//     }
// }



class string4{
    public static void main(String[] args) {
        String s1 = "Omkar how are you?";

        System.out.println(s1.contains("how"));       //returns true because s1 starts with "how"
        System.out.println(s1.contains("how you"));       //returns false because s1 are is missing "how you" in the string
        System.out.println(s1.startsWith("Omkar"));       //returns true because s1 starts with "omkar"
        System.out.println(s1.startsWith("you"));       //returns false because s1 does not start with "you"
        System.out.println(s1.endsWith("you?"));       //returns true because s1 ends with "you?"
        System.out.println(s1.toLowerCase().contains("omkar"));       //returns true because s1 contains "omkar" after converting to lowercase
}
}