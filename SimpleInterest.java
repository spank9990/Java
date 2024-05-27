import java.util.*;
class SimpleInterest{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        System.out.println((P*R*T)/100);
    }
}
