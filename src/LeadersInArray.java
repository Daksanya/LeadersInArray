import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        leadersInArray(array,n);
    }
    static void leadersInArray(int[] array,int n){
       int max=array[n-1];
        for (int i=n-2;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                System.out.print(max+" ");
            }
        }
        System.out.print(array[n-1]);
    }
}
