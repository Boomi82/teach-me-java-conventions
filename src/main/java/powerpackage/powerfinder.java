package powerpackage;

/*
public class Powerfinder {
    public static int OF(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++) {
            p *= xyz;
        }
        return p;
    }
}
*/
public class PowerFinder {
    public static int calculationOfPower(int base, int exponent) {
        int result = 1;
        while (exponent != 0) {
            result *= base;
            exponent--;
        }

        return result;
    }
