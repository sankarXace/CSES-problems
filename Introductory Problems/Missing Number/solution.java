import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Set<Integer> seen = new HashSet<Integer>();
        for(int i=0;i<n-1;i++){
            seen.add(s.nextInt());
        }
        s.close();
        for(int i=1;i<=n;i++){
            if(!seen.contains(i)){
                System.out.println(i);
                break;
            }
        }

    }
}