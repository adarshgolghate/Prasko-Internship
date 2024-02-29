import java.util.*;

public class Question62 {
    //Simple calculator with menu driven operations using switch case
    public static void main(String args[]){
        String str = "adarsh aadi";
        int frequency[] = new int[str.length()];
        int i,j;
        char string[] = str.toCharArray();
        for(i=0;i<str.length();i++){
            frequency[i]=1;
            for(j=i+1;j<str.length();j++){
                if(string[i]==string[j]){
                    frequency[i]++;
                    string[j]='0';
                }
            }
        }
        System.out.println("Character frequency is");
        for(i=0;i<frequency.length;i++){
            if(string[i]!=' ' && string[i]!='0'){
                System.out.println(string[i]+"-"+frequency[i]);
            }
        }      
    }
}
