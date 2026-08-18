// class string3{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = "Hello";
        
//         System.out.println(s1.compareTo(s2));
//     }
// }

// class string3{
//     public static void main(String[] args) {
//         String s1 = "ABCd";
//         String s2 = "ABCD";                                   
        
//         System.out.println(s1.compareTo(s2));        // it will return 32 because the difference between d and D is 32 in ASCII value
//     }
// }


// class string3{
//     public static void main(String[] args) {
//         String s1 = "ABCdefge";
//         String s2 = "ABCD";                                   
        
//         System.out.println(s1.compareTo(s2));        //returns difference between d and D in ASCII value, so it will return 32 because the difference between d and D is 32 in ASCII value and skips the rest of the characters in s1 after the common prefix with s2
// }


class string3{
    public static void main(String[] args) {
        String s1 = "ABCdefg";
        String s2 = "ABC";                                   
        
        System.out.println(s1.compareTo(s2));       //returns count of characters in s1 after the common prefix with s2, so it will return 4 because after ABC there are 4 characters in s1
}
}