import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số lượng pT arr1:");
        int n=scanner.nextInt();
        int[] arr1= new int[n];
//        nhâp phần tủ cho mảng 1
        for (int i=0;i<n;i++) {
            System.out.print("phân tử thứ" + (i + 1)+" arr1:");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("nhập số lượng pT arr2:");
        int m=scanner.nextInt();
        int[] arr2= new int[m];
        //        nhâp phần tủ cho mảng 2
        for (int i=0;i<n;i++) {
            System.out.print("phân tử thứ " + (i + 1)+" arr2:");
            arr2[i] = scanner.nextInt();
        }
        int[] newArr= new int[n+m];
        for (int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            newArr[i+n]=arr2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
