import java.util.*;

public class POD8_2 {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        String l1 = sc.nextLine();
        String line1[] = l1.split(",");
        ArrayList<Integer> marks = new ArrayList<Integer>();
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        int finding = 0;
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            marks.add(Integer.parseInt(line1[i]));
        }
        sorted.addAll(marks);
        Collections.sort(sorted);
        finding = sorted.get(n-k);
        ans = marks.indexOf(finding);
        System.out.println(ans);
        sc.close();
    }
}
