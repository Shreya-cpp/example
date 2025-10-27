class Q2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("Binary representation: " + Integer.toBinaryString(n));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
