public class Loop {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (i == 3)
                    break loop1;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
