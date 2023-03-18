import java.util.Scanner;

public class slidingWindoealgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ans = maxSubarraySum(arr);
        System.out.println(ans);
    }
    public static int maxSubarraySum(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int left =0, right =0;
        while(right<arr.length){
            currsum+=arr[right];
            while (currsum<arr[right]){
                currsum-=arr[left];
                left++;
            }
            maxsum = Math.max(currsum, maxsum);
            right++;
        }
        return  maxsum;
    }

}
