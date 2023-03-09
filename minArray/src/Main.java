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
        int max=array[0];
        for (int i=1;i<array.length;i++){
            if (max<=array[i]){
                max=array[i];
            }
        }
        System.out.println("max="+max);
    }
}
