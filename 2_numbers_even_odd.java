class Demo {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        String res = (a % 2 == 0) && (b % 2 == 0) ? "both a and b are even" : "else both are not even";
        
        // Print the result
        System.out.println(res);
    }
}
