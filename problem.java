package core;
import java.util.*;
public class problem {
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];

        for(int i=0;i<n;i++)
        arr[i]=sc.next();
    

        int len=0;
        ArrayList<String> problem = new ArrayList<String>();

        for (int i=0;i<n;i++)
        {
            len=arr[i].length();
            if(len%2==1)
            problem.add(arr[i]);
        }
        
        if(problem.size()==0)
           System.out.println("Better luck next time");

        else {
            Iterator<String> itr= problem.iterator();
            int max=-1;
            String res="";
            while(itr.Hasnext())
            {
                String temp=(String)itr.next();
                if(temp.length()>max)
                {
                    res=temp;
                    max=temp.length();
                }
            }
            System.out.println(res);
        }
    }
}            

    

