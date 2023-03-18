import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class revseredString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the string : "));
        String str = sc.nextLine();
        System.out.println("");
        String ans = reverseString(str);
        System.out.println(ans);
    }
    static String reverseString(String str){
//        initialize an empty stack
        Stack <String> st = new Stack<>();
//        spilit the sentence into words
        String [] words = str.split(" ");
//        push each word on the stack
        for(String word : words){
            st.push(word);
        }
//        initilaze an empty stack to store the reversed string
        String ans = " ";
//        pop each word ans add it to reversed sentence
        while(!st.isEmpty()){
            String word = st.pop();
            ans+=word+" ";
        }
//        remove the xtra space at the end
        ans =ans.trim();
        return ans;

    }



}
