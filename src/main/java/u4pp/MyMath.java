package u4pp;

public class MyMath {
    public static int abs(int x){
        if (x>0){
            return x;
        }
        return x *= -1;
    }

    public static double abs (double x){
        if (x < 0){
            x *= -1;
        }
        return x;
    }
    
    public static double pow (double base, int exponent){

        double i = 1.0;

        if (exponent == 0 && base > 0){
            return 1;
        } else if (exponent == 0 && base < 0){
            return -1;
        }
        while (exponent != 0){
                i = i * base;
                exponent --;
            }
        return i;
        }
    public static int perfectSqrt(int x){
        if (x < 0) {
            return -1;
        } else if (x < 2) {
            return x;
        } else {
            for (int i = 0; i < x; i++) {
                if (i * i == x) {
                    return i;
                }
            }
                return -1;
        }
    }
}


    

