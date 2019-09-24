package fourth;

public class MathService {

    public int add(int x, int y) {
        return y == 0 ? x :
                add(x^y,(x&y)<<1);
    }

    public int subtract(int x, int y) {
        while (y != 0) {
            int borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
        }
        return x;
    }

    public int multiply(int x, int y) {
        int res = 0, count = 0;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = add(res, x << count);
            }
            count = add(count, 1);
            y >>= 1;
        }
        return res;
    }

    public int divide(int x, int y) {
        int sign = ((x < 0) ^
                (y < 0)) ? -1 : 1;
        x = Math.abs(x);
        y = Math.abs(y);
        int quotient = 0;
        while (x >= y) {
            x = subtract(x, y);
            quotient = add(quotient, 1);
        }

        return multiply(sign, quotient);
    }

    public int mod(int x, int y) {
        return subtract(x, multiply(y, divide(x, y)));
    }
}
