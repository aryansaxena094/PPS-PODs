import java.util.*;

public class POD5 {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] check = new String[n];
        ArrayList<String> tocheck = new ArrayList<String>();
        ArrayList<String> ans = new ArrayList<String>();

        for(int i = 0; i < n; i++)
        {
            check[i] = sc.nextLine();
        }
        tocheck.add(sc.nextLine());
        for(int i = 0; i < tocheck.size(); i++)
        {
            tocheck.add(sc.nextLine());
            String temp = "";
            String current[] = tocheck.get(i).split(" ");

            loop1: for(int j = 0; j < current.length; j++)
            {
                temp = current[j];
                temp = temp.replaceAll("[^a-zA-Z0-9]", "");

                for(int k = 0; k < n; k++)
                {
                    if(check[k].contains(temp))
                    {
                        String a[] = check[k].split(" ");
                        ans.add(a[0]);
                        break loop1;
                    }

                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
