import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x");
        int x=scanner.nextInt();
        System.out.println("y");
        int y=scanner.nextInt();
        int[][] arr=new int[x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("nhap phan tu cho man["+ i+","+ j +"] : ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println( Arrays.deepToString(arr));
        int max=0;
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                max=arr[i][j];
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("max = "+max);
    }
}
