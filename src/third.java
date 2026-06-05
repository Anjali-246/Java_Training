import java.util.*;
public class third {
    public static void main(String[] args) {
        String str = "i love coding";
        System.out.println(str.length());
        int count=0;
        for(int i=0;i<str.length();i++){
            count+=1;
        }
        System.out.println(count);

        //char array[]=str.toCharArray();
        //System.out.println(Arrays.toString(array));

        StringBuilder sb=new StringBuilder(str);
        String rev= sb.reverse().toString();
        System.out.println(rev);

        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        System.out.println(str2);

        String str3="";
        String array[]=str.split(" ");
        for(int i=array.length-1;i>=0;i--){
            str3+=array[i]+" ";  //sop(array[i]+" ");
        }
        System.out.println(str3);
    }
}


