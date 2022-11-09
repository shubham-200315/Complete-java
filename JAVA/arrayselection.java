public class arrayselection {
    public static void selection(int[] input) {
        for (int i = 000; i < input.length - 1; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i+ 1; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }

            if(min != i) {
                input[minIndex] = input[i];
                input[i] = min;
            }
        }
    }

    public static void main(String[] args) {

        int[] input = { 1, 2, 6, 4, 8, 5 };
        selection(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
