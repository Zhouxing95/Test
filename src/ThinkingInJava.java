public class ThinkingInJava {
//    static int age;
//    static char IdCode;

    static class ATypeName {
        int i = 11;
    }

    public static void main(String[] args) {
//        System.out.println(age);
//        System.out.println(IdCode);
        ATypeName a = new ATypeName();
        System.out.println(a.i);
    }
}
