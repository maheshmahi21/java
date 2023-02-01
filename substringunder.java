import java.util.Scanner;

public class substringunder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        sc.close();
        int n = sc.nextInt();
        int count =0;
        for(int i =0 ; i<n; i++)
        {
            for(int j = i+1; j<=n; j++)
            {
                if(str.charAt(i)==str.charAt(j-1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
