import java.util.Random;

public class MathOps {
    // Shorthand to print a string and an int
    static void printInt(String s, int i) {
        System.out.println(s + " = " + i);
    }

    // Shorthand to print a string and a float
    static void printFloat(String s, float f) {
        System.out.println(s + " = " + f);
    }
    

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        
        // Choose value from [0, 99]
        j = rand.nextInt(100);
        k = rand.nextInt(100);
        printInt("j", j); printInt("k", k);
        i = j + k; printInt("j + k", i);
        i = j - k; printInt("j - k", i);
        i = k / j; printInt("k / j", i);
        i = k * j; printInt("k * j", i);
        i = k % j; printInt("k % j", i);
        j %= k; printInt("'j %= k'", j);
        
        // Floating-point number tests
        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        printFloat("v", v); printFloat("w", w);
        u = v + w; printFloat("v + w", u);
        u = v - w; printFloat("v - w", u);
        u = v * w; printFloat("v * w", u);
        u = v / w; printFloat("u / w", u);
        
        // The following also works for char, byte, short,
        // int, long, and double
        u += v; printFloat("'u += v'", u);
        u -= v; printFloat("'u -= v'", u);
        u *= v; printFloat("'u *= v'", u);
        u /= v; printFloat("'u /= v'", u);
    }
}