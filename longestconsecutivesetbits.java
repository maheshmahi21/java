import java.util.Scanner;

public class longestconsecutivesetbits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ans = lcs(n);
            System.out.println(ans);
        }
    }
    static int lcs(int n ){
        int count =0;
        while(n!=0){
            n=n & n<<1;
                count++;


        }
        return count;
    }


}
