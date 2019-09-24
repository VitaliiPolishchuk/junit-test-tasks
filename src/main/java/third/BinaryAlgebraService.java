package third;

public class BinaryAlgebraService {
    public int getCountBitSpace(long num){
        int res = 0;
        while(num != 0){
            num >>>= 1;
            ++res;
        }
        return res;
    }
}
