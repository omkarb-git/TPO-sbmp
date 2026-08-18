class string5{
    public static void main(String[] args) {
        char x = 'A';
        System.out.println(x); 
        System.out.println((int)x); // it will return 65 because the ASCII value of A is 65

        String s2 = "ABC";
        System.out.println(s2.codePointAt(0));
    }
}