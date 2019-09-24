package fifth;

public class Main {

    EqualsService equalsService;

    public void setEqualsService(EqualsService equalsService) {
        this.equalsService = equalsService;
    }

    public int changeBit(int num, int pos, int target){
        return equalsService.equals(target, 1) ? num | (1 << pos) :
                num & (~(1 << pos));
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.setEqualsService(new EqualsService());

        System.out.println(main.changeBit(8, 3, 0)); //0
        System.out.println(main.changeBit(8, 0, 1)); //9
    }
}
