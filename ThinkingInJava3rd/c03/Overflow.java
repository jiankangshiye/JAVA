public class Overflow {
    public static void main(String[] args) {
        int big = 0x7fffffff; // max int vale
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}