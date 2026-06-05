import java.util.*;
public class six {
    public static void main(String[] args){
        int arr[][]={

                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));*/

        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
