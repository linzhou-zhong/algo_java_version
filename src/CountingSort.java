import java.util.Arrays;

public class CountingSort {

    public int[] sort(int[] origin){
        int size = origin.length;
        int[] R = new int[size];
        int max = Arrays.stream(origin).max().getAsInt();
        int min = Arrays.stream(origin).min().getAsInt();
        int[] C = new int[max - min + 1];
        //创建统计数集
        for (int value: origin){
            C[value-min] ++;
        }
        for (int i: C){
            System.out.print(i);
        }
        System.out.println();
        //依次累加
        for (int i = 1; i<C.length; i++){
            C[i] = C[i-1] + C[i];
        }

        for (int i: C){
            System.out.print(i);
        }
        System.out.println();
        for (int i = size-1; i >= 0; i--){
            int val = origin[i];
            int pos = C[val-min];
            R[pos-1] = val;
            C[val-min] --;
        }
        return R;
    }

    public static void main(String[] args) {
        CountingSort c = new CountingSort();
        int[] list = new int[]{2,3,4,11,6,10,9};
        for (int i: c.sort(list)){
            System.out.print(i + " ");
        }
    }
}
