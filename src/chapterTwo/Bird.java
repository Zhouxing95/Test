package chapterTwo;

public class Bird {

    public Bird(){
        System.out.println("咕咕咕咕咕！");
    }

    public Bird(String i){
        System.out.println( i +"咕咕咕咕咕咕");
    }
    public static void main(String[] args) {
        Bird bird = new Bird("金咕咕：");
    }

}
