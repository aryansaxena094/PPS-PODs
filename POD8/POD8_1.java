import java.util.*;

public class POD8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String line1[] = l1.split(" ");
        ArrayList<String> unique = new ArrayList<String>();
        ArrayList<String> unique1 = new ArrayList<String>();
        int index1 = 0;
        int index2 = 0;
        int diff = Integer.MAX_VALUE;
        String ans = "";
        for(int i = 0; i < line1.length; i++)
        {
            if(unique.contains(line1[i]) == false)
            {
                unique.add(line1[i]);
            }
        }

        unique1.addAll(unique);

        for(int i = 0; i < line1.length; i++)
        {
            String a = line1[i];
            index1 = i;
            for(int j = i; j < line1.length; j++)
            {
                index2 = j;
                String b = line1[j];
                if(unique.contains(b))
                {
                    unique.remove(b);
                }

                if(unique.isEmpty())
                {
                    break;
                }
            }
            if(diff > index2 - index1 && unique.isEmpty())
            {
                diff = index2 - index1;
                ans = (index1+1) + " " + (index2+1);
            }
            unique.addAll(unique1);
        }
        System.out.println(ans.trim());
        sc.close();
    }
}
