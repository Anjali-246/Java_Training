
//TCS NQT coding question september dat 1- slot 1
//move zeroes to right end
/*
import java.util.*;
public class movezeroes {
    public static void main(String[] args) {
        int[] arr = {1,4,5,0,9,6,0,7,0};
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i <arr.length ; i++) {
            arr[i]=0;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
*/
import java.util.*;
public class movezeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i <n ; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
