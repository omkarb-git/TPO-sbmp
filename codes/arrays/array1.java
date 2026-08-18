class array1 {
    // int x[] = new int[5]; // it will create an array of size 5 and initialize all elements to 0
    //     int y[];
    //     int x[] = {1, 2, 5}; // it will create an array of size 3 and initialize the elements to 1, 2, 5

    //     // both allowed
    //     int x[];
    //     int []y;
        public static void main(String[] args) {
        int x[] = new int[5]; // it will create an array of size 5 and initialize all elements to 0
        x[3] = 89;
        System.out.println(x[3]); // it will print 89
        System.out.println(x[4]); // it will print 0 because the default value of int is 0
        System.out.println(x[5]); // it will give an error because the index is out of bounds
        }
}