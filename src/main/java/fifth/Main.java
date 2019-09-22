package fifth;

public class Main {
    public static void main(String[] args) {
        System.out.println(changeBit(8, 3, 0));
        System.out.println(changeBit(8, 0, 1));
    }

    private static int changeBit(int num, int pos, int target){
        return (target == 1) ? num | (1 << pos) :
                num & (~(1 << pos));
    }
}
