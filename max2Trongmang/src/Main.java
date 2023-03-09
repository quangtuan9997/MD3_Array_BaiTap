import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số lượng pT:");
        int n=scanner.nextInt();
        int[] array= new int[n];
//        nhâp phần tủ cho mảng
        for (int i=0;i<n;i++) {
            System.out.println("phân tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int max1=array[0],max2=array[0];
        for (int i=1;i<array.length;i++){
            int tem;
            if (max2<array[i]){
                max2=array[i];
                if (max2>max1){
                    tem=max1;
                    max1=max2;
                    max2=tem;
                }
            }
        }
        System.out.println("giat tri lon thu 2 ="+max2);
    }
}
