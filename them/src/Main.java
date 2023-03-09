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
        System.out.println("nhập phần tử cần thêm : ");
        int elment=scanner.nextInt();
        int index;
        while (true){
            System.out.println("nhập vị trí cần thêm : ");
            index=scanner.nextInt();
            if (index>0 && index<array.length){
                break;
            }
        }
        int[] newArray= new int[n+1];
        for (int i=0;i<index;i++){
            newArray[i]=array[i];
        }
        for (int i=index;i<array.length;i++) {
            newArray[i + 1] = array[i];
        }
        newArray[index]=elment;
        System.out.println(Arrays.toString(newArray));
    }
}
