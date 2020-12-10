package chapterSeven;

public class TestExtend {

    static class Art {
        Art() {
            System.out.println("Art.Art");
        }

        static class Drawing extends Art {
            Drawing() {
                System.out.println("Drawing.Drawing");
            }
        }

        public static class Cartoon extends Drawing {
            public static void main(String[] args) {
                Cartoon cartoon = new Cartoon();
            }
        }
    }
}
