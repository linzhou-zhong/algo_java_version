import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public void insertion(int a[], int n){
        if (n < 1){
            return;
        }
        for (int i = 1; i < n; i++){
            int tmp = a[i];
            int j = i - 1;

            for (;j >=0; j--){
                if (a[j] > tmp){
                    a[j+1] = a[j];
                }
                else
                    break;
            }

            a[j+1] = tmp;
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int [] list = new int []{1,3,5,2,4};
        is.insertion(list, list.length);
        Arrays.stream(list).forEach(System.out::print);
    }
}
