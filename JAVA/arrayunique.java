
import java.util.*;

public class arrayunique {
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unq[] = new int[n];
        for (int i = 0; i < n; i++) {
            unq[i] = sc.nextInt();
        }
        return unq;
    }

    public static int unique(int unq[]) {
        int x = 0;
        for (int i = 0; i < unq.length; i++) {
            for (int j = 0; j < unq.length; j++) {
                if (i != j) {
                    if (unq[i] == unq[j]) {
                        break;
                    } else {
                        x = unq[j];
                    }
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int unq[] = takeinput();
        int x = unique(unq);
        System.out.println(x);
    }
}
