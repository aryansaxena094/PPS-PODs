import java.util.ArrayList;
import java.util.Scanner;

public class POD11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String paths[] = new String[n];
        ArrayList<String> route = new ArrayList<String>();
        String ans = "";
        for(int i = 0; i < n; i++){
            paths[i] = sc.nextLine();
        }

        int count = 0;
        int flag = 0;
        while(flag < paths.length)
        {
            for(int i = 0; i < n; i++){
                String s[] = paths[i].split(" ");
                if(i == 0 && count == 0){
                    route.add(s[0]);
                    route.add(s[1]);
                    count++;
                }
                else if(route.contains(s[0].trim()) && route.contains(s[1].trim()))
                {
                    flag++;
                    continue;
                }
                else if(route.contains(s[0].trim())&& (route.contains(s[1].trim())==false)){
                    route.add(route.indexOf(s[0])+1,s[1]);
                }
                else if(route.contains(s[1].trim()) && (route.contains(s[0].trim())== false)){
                    route.add(route.indexOf(s[1]),s[0]);
                }
            }
        }
        for(int i = 0; i < route.size(); i++){
            ans = ans + " " + route.get(i);
        }
        System.out.println(ans.trim());
    }
}
