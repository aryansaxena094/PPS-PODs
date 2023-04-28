import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> dict = new ArrayList<String>();
        ArrayList<String> ans = new ArrayList<String>();
        ArrayList<String> test = new ArrayList<String>();
        for(int i = 0; i < n; i++)
        {
            String line = sc.nextLine();
            dict.add(line);
        }
        
        while(sc.hasNext())
        {
            String line1 = sc.nextLine();
            if(line1.equals(""))
            {
                break;
            }
            else
            {
                test.add(line1);
            }
        }

        for(int i = 0; i < test.size(); i++)
        {
            String t[] = test.get(i).split(" ");
            
            loop1: for(int j = 0; j < t.length; j++)
            {
                String word = t[j].replaceAll("[^a-zA-Z0-9]" ,"");
                
                for(int k = 0; k < dict.size(); k++)
                {
                    ArrayList<String> l1 = new ArrayList<String>(Arrays.asList(dict.get(k).split(" ")));
                    String temp = l1.get(0);
                    l1.set(0, "");
                    if(dict.get(k).contains(word))
                    {
                        ans.add(temp);
                        break loop1;
                    }
                }
            }
        }
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
