class parameterised {

    // Parameterized constructor
    parameterised(String message) {
        System.out.println("Helloooo..... " + message);
    }

    public static void main(String[] args) {
        System.out.println("Start small, ship something");

        parameterised p1 = new parameterised("Object 1");
        parameterised p2 = new parameterised("Object 2");
    }
}
