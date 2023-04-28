import java.util.Scanner;

public class POD10_1 {
    private Node head;
    
    
    POD10_1(){
        this.head = null;
    }
    
    public class Node extends POD10_1{
        String s;
        Node left;
        Node right;
        
        Node(){
            s = null;
            left = null;
            right = null;
        }
        Node(String s, Node left, Node right)
        {
            this.s = s;
            this.right = right;
            this.left = left;
        }
    }

    public void addNode(String data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            head.previous = null;  
        }
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String lines[] = new String[n];
        
        for(int i = 0; i < lines.length; i++){
            lines[i] = sc.nextLine();
        }
        for(int i = 0; i < lines.length; i++){
            String values[] = lines[i].split(" ");
            
        }
        sc.close();
    }
    
    
    
}
