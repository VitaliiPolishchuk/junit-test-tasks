package third;

public class Main {

    BinaryAlgebraService binaryAlgebraService;

    public static void main(String[] args) {

        Main main = new Main();
        main.setBinaryAlgebraService(new BinaryAlgebraService());

        System.out.println(main.getCountBitSpace((byte) 1));
        System.out.println(main.getCountBitSpace((short) 8));
        System.out.println(main.getCountBitSpace((int) 0));
        System.out.println(main.getCountBitSpace(Integer.MAX_VALUE));
        System.out.println(main.getCountBitSpace(-1));
        System.out.println(main.getCountBitSpace(1000L));
        System.out.println(main.getCountBitSpace(-1000L));
    }

    public void setBinaryAlgebraService(BinaryAlgebraService binaryAlgebraService){
        this.binaryAlgebraService = binaryAlgebraService;
    }


    public int getCountBitSpace(long num){

        return binaryAlgebraService.getCountBitSpace(num);
    }
}
