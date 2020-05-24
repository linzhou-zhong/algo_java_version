import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public void bubbleBubble(int a[], int n){
        if (n < 1){
            return;
        }

        for (int i = 0; i < n; i++){
            boolean change_data = false; //判断是否需要继续循环, 数列在中间步骤的时候可能就已经完全排序
            for (int j = 0; j < n - i - 1; j ++){
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    change_data = true;
                }
            }
            if (!change_data)
                break;
        }
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int [] list = new int [] {3,4,5,1,3,2};
        b.bubbleBubble(list, list.length);
        Arrays.stream(list).forEach(System.out::println);
    }
}
