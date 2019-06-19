package HashMapQiantao;


import java.util.Arrays;
import java.util.Scanner;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数字");
        String inputString = sc.nextLine();
        String[] stringArray = inputString.split(" ");

        int[] num = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }
        solution(num);
    }
    public static void solution(int[] num) {
        Arrays.sort(num);
        for (int a = num.length - 1; a >= 2; a--) {
            if (num[a] < num[a - 1] + num[a - 2]) {
                System.out.println("此三角形最大的周长是"+(num[a] + num[a - 1] + num[a - 2]));
            } else{
                System.out.println("无法组成三角形"+0);}
        }
    }
}

