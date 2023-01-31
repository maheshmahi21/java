import java.util.Scanner;

public class maxoddmineven {
    public static void main(String[] srgs){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int maxOdd = Integer.MIN_VALUE;
            int minEven = Integer.MAX_VALUE;
            for(int i =0; i<n; i++){
                int num = in.nextInt();
                if(num%2==0) {
                    minEven = Math.min(minEven, num);
                }
                else{
                    maxOdd= Math.max(maxOdd,num);
                }
            }
            System.out.println(maxOdd-minEven);
        }
    }
}
