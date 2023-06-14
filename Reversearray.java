import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    } 
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    
}
