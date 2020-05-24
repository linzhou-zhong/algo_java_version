import java.util.Arrays;

public class SelectiongSort {
    public void selection(int[] a, int n){
        for (int i=0; i < n; i++){
            double min = Double.POSITIVE_INFINITY;
            int j = i;
            int position = -1;
            for (; j < n; j++){
                if (a[j] < min){
                    min = a[j];
                    position = j;
                }
            }

            int tmp = a[i];
            a[i] = a[position];
            a[position] = tmp;
        }

    }

    public static void main(String[] args) {
        SelectiongSort ss = new SelectiongSort();
        int [] list = new int[] {3,5,2,4,1};
        ss.selection(list, list.length);
        Arrays.stream(list).forEach(System.out::print);
    }
}
