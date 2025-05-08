package design.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,7,8,-1,-3};
//        List<Integer> list = Arrays.stream(arr).map(n ->  n*n*n).boxed().toList();
//        System.out.println(list);
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
