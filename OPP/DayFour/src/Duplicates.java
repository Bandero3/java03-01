import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

    /*Write a Java program to print after removing duplicates from a given string.

        Sample Output:

        The given string is: w3resource
        After removing duplicates characters the new string is: w3resouc*/

    public static void main(String[] args) {

        String test = "Ant";
        test = test + "o";
        System.out.println(test);

        String str = "w3resource";
        int lenght = str.length();

        removeDuplicate(str,lenght);

        }

    static void removeDuplicate(String str, int length) {
        int index =0;
        char[] c = str.toCharArray();
        String newString = "";
        for(int i=0; i< length; i++){
            int j;
            for(j=0; j<i; j++) {
                if(c[i] ==c[j]){
                    break;
                }
            }
            if(j==i){
//                c[index++] = c[i];
//                System.out.printf("%s",c[i]);
                newString += c[i];
            }
        }
        System.out.println(newString);


    }
}

