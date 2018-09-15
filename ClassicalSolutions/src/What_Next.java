import java.util.Scanner;

public class What_Next {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0)
                break;

            else {
                if (checkAP(a, b, c)) {
                    System.out.println("\nAP " + findNextAP(a, b, c));
                } else {
                    System.out.println("\nGP " + findNextGP(a, b, c));
                }
            }
        }
    }

    private static boolean checkAP(int a, int b, int c){
        return (b - a) == (c - b);
    }

    private static int findNextAP(int a, int b, int c){
        int d = b-a;
        return c+d;
    }

    private static int findNextGP(int a, int b, int c){
        int m = b/a;
        return c*m;
    }
}
