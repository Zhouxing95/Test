package chapterFive;

public class EnumOrder {
    public static void main(String[] args) {
        for (RmbEnum rmbEnum : RmbEnum.values()) {
            System.out.println(rmbEnum + ".ordinal " + rmbEnum.ordinal());
        }
    }
}
