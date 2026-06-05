/*
public class fourth {
    public static void main(String[] args) {
        String str = "i love to do code in java programming";

        String words[] = str.split(" ");

        int maxlen = 0;
        String maxword = "";
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (len > maxlen) {
                maxlen = len;
                maxword = words[i];
            }
        }
        System.out.println(maxword);
        System.out.println(maxlen);
    }
}


//password check
public class fourth  {
    static int check(String str, int n) {
        int capital = 0;
        int digit = 0;
        if(str.length() < 4) {
            return 0;
        }
        if(Character.isDigit(str.charAt(0))) {
            return 0;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ' || ch == '/') {
                return 0;
            }
            if(Character.isUpperCase(ch)) {
                capital++;
            }
            if(Character.isDigit(ch)) {
                digit++;
            }
        }
        if(capital >= 1 && digit >= 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        String str = "aA1_67";
        System.out.println(check(str, str.length()));
    }


//AND OR XOR operations
import java.util.*;
public class fourth
{
    public static int operationBinaryString(String str)
    {
        if(str == null || str.length() % 2 == 0) {
            return -1;
        }
        int first = str.charAt(0) - '0';
        for(int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int second = str.charAt(i + 1) - '0';
            if(op == 'A') {
                first = first & second;
            }
            else if(op == 'B') {
                first = first | second;
            }
            else if(op == 'C') {
                first = first ^ second;
            }
        }
        return first;
    }
    public static void main(String[] args)
    {
        String str = "1C0C1C1A0B1";
        System.out.println(operationBinaryString(str));
    }
}




//two elements sum ==target
public class fourth{
    public static void main(String[] args){
        int arr[]={2,4,1,7,5,6,55,16,19};

        int target=20;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


 */


import java.util.*;
public class fourth{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int front=0;
        int end=arr.length-1;
        while(front<end){
            if(arr[front]%2!=0 && arr[end]%2==0) {
                int temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
            }
            else if(arr[front]%2==0) {
                front++;
            }
            else{
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}