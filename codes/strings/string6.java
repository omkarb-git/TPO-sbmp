// class stringDS{

//         int id = 1;
//         String name = "Omkar";

//         public String toString() {
//             return "id: " + id + ", name: " + name;
//         }
// }

// public class string6{
    
//     public static void main(String[] args) {
//         string6 s1 = new string6();
//         System.out.println(s1.toString()); // it will print the address of the object because we have not overridden the toString() method in the string6 class
//         System.out.println(s1); // it will print the address of the object because we have not overridden the toString() method in the string6 class
//     }

// }



// new 

// class string6 {
//     public static void main(String[] args) {
//         String s1 = "hello students";

//         for (int i = 0; i < s1.length(); i++) {
//             System.out.println(s1.charAt(s1.length() - 1 - i)); // it will print the string in reverse order
//         }

         
//     }
// }


// new

class string6 { 
    public static void main(String[] args) {
        String s1 = "hello students";
        String consonents = "";
        String vowels = "";

        // extract vowels
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);        // it will return the character at the specified index
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels += ch;   
            }
            
            else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                consonents += ch;
            }
        }
        System.out.println("Consonants: " + consonents);
        System.out.println("Vowels: " + vowels);

}
}
