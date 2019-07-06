package ReverstInt;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
    private static int reverse(int x) {
        String str = String.valueOf(x);
        int [] arr = new int[str.length()];
        for(int index = 0; index<str.length(); index++){
            Character ch = str.charAt(index);
            arr[index] = Integer.parseInt(ch.toString());
        }
//        for(int i = 0; i<arr.length+1;i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = arr[i+2];
//            arr[i+2] = temp;
//        }

        int temp = 0;
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String s = "";
        for(int i = 0; i < arr.length; i++){
            s = s + arr[i]+"";
        }
        return Integer.parseInt(s);
    }
}
