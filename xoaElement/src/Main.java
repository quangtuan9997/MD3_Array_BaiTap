import java.lang.reflect.Array;
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
        System.out.println("phan tu can xoa");
        int delete=scanner.nextInt();
        int[] newArray=new int[n-1];
        for (int i=0;i<array.length;i++){
            if(array[i]==delete){
                for (int j=0;j<i;j++){
                    newArray[j]=array[j];
                }
                for (int j=i+1;j<array.length;j++){
                    newArray[j-1]=array[j];
                }
            }
        }System.out.println(Arrays.toString(newArray));

    }
}
