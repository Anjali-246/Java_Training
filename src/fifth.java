/*public class fifth {
    public static void main(String[] args){
        int a1[]={1,2,3,4,5,6};
        int a2[]={2,4,6,8,10};
        int a3[]={2,3,6,9,12};

        int i=0;
        int j=0;
        int k=0;
        while(i<a1.length && j <a2.length && k<a3.length){
            if(a1[i] == a2[j] && a2[j] ==a3[k])
            {
                System.out.println(a1[i]);
                i++;
                j++;
                k++;
            }
            else if(a1[i]<a2[j]){
                i++;
            }
            else if(a2[j]<a3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
}


public class fifth {
    public static void main(String[] args){
        int a1[]={1,2,3,4,5,6};
        int a2[]={2,4,6,8,10};
        //int a3[]={2,3,6,9,12};

        int i=0;
        int j=0;
        //int k=0;
        while(i<a1.length && j <a2.length){
            if(a1[i] == a2[j])
            {
                System.out.println(a1[i]);
                i++;
                j++;
                //k++;
            }
            else if(a1[i]<a2[j]){
                i++;
            }
            //else if(a2[j]<a3[k]){
              //  j++;
            //}
            else{
                j++;
            }
        }
    }
}
*/

//replace word with another
import java.util.Scanner;
public class fifth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String s = sc.nextLine();

        System.out.println("Enter old word:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        if(s.contains(oldWord)) {

            s = s.replace(oldWord, newWord);

            System.out.println(s);
        }

        else {
            System.out.println("Word not found");
        }
    }
}

