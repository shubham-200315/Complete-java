import java.util.*;
public class arrayduplicate {
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dplc[] = new int[n];
        for (int i = 0; i < n; i++) {
            dplc[i] = sc.nextInt();
        }
        return dplc;
    }
    public static int duplicate(int dplc[]) {
        int x = 0;
        for (int i = 0; i < dplc.length; i++) {
            for (int j = 0; j < dplc.length; j++) {
                if (i != j) {
                    if (dplc[i]!= dplc[j]) {
                        continue;
                    } else {
                        x = dplc[j];
                    }
                }
            }
        }
        return x;
    }
    public static void main(String[]args)
    {
        int dplc[]= takeinput();
        int x= duplicate(dplc);
        System.out.println(x);

    }
}
