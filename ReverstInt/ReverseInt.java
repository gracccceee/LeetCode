//package ReverstInt;
//
//import java.util.Scanner;
//
//public class ReverseInt {
//    public void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int x = sc.nextInt();
//        System.out.println(reverse(x));
//    }
//    private int reverse(int x) {
//        String str = x.toString();
//        int [] arr = new int[str.length()];
//        for(int index = 0; index<str.length(); index++){
//            Character ch = str.charAt(index);
//            arr[index] = Integer.parseInt(ch.toString());
//        }
//        for(int i:arr){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        int num = transfer(arr);
//        return num;
//    }
//    public static int transfer(int[]arr){
//        String str = "";
//        for(int i = 0;i<arr.length;i++){
//            String s =new String();
//            int z = arr[i];
//            s=Integer.toString(z);
//            str = str.concat(s);
//        }
//        int num = Integer.parseInt(str);
//        return num;
//    }
//}
