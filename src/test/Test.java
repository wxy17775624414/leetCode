package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {40, 20, 10, 30};
//        int[] b = arrayRankTransform(arr);
//        System.out.println(Arrays.toString(b));
        System.out.println(SSSS());

    }

    private static Integer SSSS() {
        int i = 0;
        switch (2) {
            case 1:
                //todo 修改类别名称
                break;
            case 2:
                i = 1;
                break;
            default:
                break;
        }
        return i;
    }

    public static int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] a = arr.clone();
        Arrays.sort(a);
        int temp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(a[i])) {
                temp++;
                map.put(a[i], temp);
            }
        }
        for (int j = 0; j < len; j++) {
            a[j] = map.get(arr[j]);
        }
        return a;
    }
}
