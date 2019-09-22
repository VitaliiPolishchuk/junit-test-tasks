package third;

public class Main {



    public static void main(String[] args) {
        System.out.println(getCountBitSpace((byte) 1));
        System.out.println(getCountBitSpace((short) 8));
        System.out.println(getCountBitSpace((int) 0));
        System.out.println(getCountBitSpace(Integer.MAX_VALUE));
        System.out.println(getCountBitSpace(-1));
        System.out.println(getCountBitSpace(1000L));
        System.out.println(getCountBitSpace(-1000L));
    }

    public static int getCountBitSpace(long num){
        return BinaryAlgebraService.getCountBitSpace(num);
    }
}
