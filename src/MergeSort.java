import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public void merge(int [] a, @NotNull List<Integer> b, @NotNull List<Integer> c){
        int i = b.get(0); // i = p
        int j = c.get(0); // j = q + 1
        List<Integer> tmp = new ArrayList<>();

        while (i <= b.get(1) && j <= c.get(1)){
            if (a[i] >= a[j]){
                tmp.add(a[j++]);
            }
            else
                tmp.add(a[i++]);
        }
        //查询是否有末尾元素未插入进去
        if (i <= b.get(1)){
            while (i <= b.get(1))
                tmp.add(a[i++]);
        }
        else if (j <= c.get(1)){
            while (j <= c.get(1))
                tmp.add(a[j++]);
        }

        for (int t = b.get(0); t <= c.get(1); t++){
            a[t] = tmp.get(t-b.get(0)); //换原始数组·
        }

        return;

    }
    public void merge_sort(int [] a, int p, int r){
        if (p >= r) // 判断终止条件
            return;
        int q =(r + p)/2; //分割点
        merge_sort(a, p, q);
        merge_sort(a, q+1, r);
        merge(a, Arrays.asList(p, q), Arrays.asList(q+1, r));

    }

    public static void main(String[] args) {
        int [] list = new int []{3,2,6,9,1};
        MergeSort ms = new MergeSort();
        ms.merge_sort(list, 0, list.length - 1);
        for (int i: list){
            System.out.print(i);
        }
    }
}
