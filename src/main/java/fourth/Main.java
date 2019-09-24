package fourth;

public class Main {

    MathService mathService;

    public static void main(String[] args) {

        Main main = new Main();

        main.setMathService(new MathService());

        System.out.println(main.gcd(25, 5));
        System.out.println(main.gcd(9, 6));
    }

    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a:
                gcd(b, mathService.mod(a, b));
    }
}
