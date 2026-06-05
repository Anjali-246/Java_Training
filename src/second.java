/*import java.util.*; -------------->running sum
public class second
{
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    }
 */

/*
import java.util.*;

public class Main
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
    }
}


*/




/*

//left sum and right sum difference
import java.util.*;
public class second
{
    public static void main(String[] args) {

        int arr[]={10,4,8,3};

        int left[]=new int[arr.length];

        int right[]=new int[arr.length];

        left[0]=0;
        right[arr.length-1]=0;

        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]+arr[i-1];
        }

        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(arr));

    }
}

*/



//move zeros to end
/*
import java.util.*;

public class second
{
    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        int index = 0;

        // move non-zero elements
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                arr[index] = arr[i];
                index++;
            }
        }

        // fill remaining with zeros
        for(int i = index; i < arr.length; i++) {

            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}


//ibm qsn
public class second{
    public static void main(String[] args){
        int arr[]={100,180,260,310,40,535,695};

        int profit=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);

            }
        }


        System.out.println(profit);

    }
}


*/


//leetcode 1385
import java.util.*;

public class second
{
    public static void main(String[] args) {

        int arr1[] = {4,5,8};
        int arr2[] = {10,9,1,8};

        int d = 2;

        int count = 0;

        for(int i = 0; i < arr1.length; i++) {

            int j = 0;

            for(j = 0; j < arr2.length; j++) {

                if(Math.abs(arr1[i] - arr2[j]) <= d) {

                    break;
                }
            }

            if(j == arr2.length) {

                count++;
            }
        }

        System.out.println(count);
    }
}

