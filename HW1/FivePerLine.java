public class FivePerLine {
    public static void main(String[] args) {
        int i = 1000;
        while (i <= 2000) {
            System.out.print(i++ + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}