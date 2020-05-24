import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public void sort(List<Integer> original, List<Integer> resume){
        if (original.size() == 0)
            return;
        else if (original.size() == 1) //递归结束条件
        {
            resume.add(original.get(0));
            return;
        }

        int pivot = original.get(original.size() - 1);

        List<Integer> left  = new ArrayList<>();
        List<Integer> right  = new ArrayList<>();

        for (int i = 0; i <= original.size() - 2; i++){
            if (original.get(i) <= pivot)
                left.add(original.get(i));
            else
                right.add(original.get(i));
        }
        sort(left, resume);
        sort(Arrays.asList(pivot), resume);
        sort(right, resume);
    }

    public static void main(String[] args) {
        List<Integer> resume = new ArrayList<>();
        List<Integer> original = Arrays.asList(3,3,2,4,1,8,9);
        QuickSort qs = new QuickSort();
        qs.sort(original, resume);
        System.out.println(resume);
    }
}
