package chapterFive;

public class Burrito {
    RmbEnum rmbEnum;

    public Burrito(RmbEnum rmbEnum){
        this.rmbEnum = rmbEnum;
    }

    public void describe(){
        System.out.println("This burrito is ");

        switch (rmbEnum){
            case ONE_RMB:
                System.out.println("人民币币值：1元.");
                break;
            case FIVE_RMB:
                System.out.println("人民币币值：5元.");
                break;
            case TEN_RMB:
                System.out.println("人民币币值：10元.");
                break;
            case TWENTY_RMB:
                System.out.println("人民币币值：20元.");
                break;
            case FIFTY_RMB:
                System.out.println("人民币币值：50元.");
                break;
            case HUNDRED_RMB:
                System.out.println("人民币币值：100元.");
                break;
        }
    }

    public static void main(String[] args) {
        Burrito
                one = new Burrito(RmbEnum.ONE_RMB),
                five = new Burrito(RmbEnum.FIVE_RMB),
                ten = new Burrito(RmbEnum.TEN_RMB),
                twenty = new Burrito(RmbEnum.TWENTY_RMB),
                fifty = new Burrito(RmbEnum.FIFTY_RMB),
                hundred = new Burrito(RmbEnum.HUNDRED_RMB);
        one.describe();
        five.describe();
        ten.describe();
        twenty.describe();
        fifty.describe();
        hundred.describe();
    }
}
