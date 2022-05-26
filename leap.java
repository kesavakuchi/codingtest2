package core;

class leap {
 
    // Main driver method
    public static void main(String[] args)
    {
        
        int year = 2020;
        // Considering user entered custom leap year
 
        int n = 15;
        
 
        int count =0;
 
        while (count != n)
        {
 
            year = year + 1;
            
 
            if ((year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0)) {
 
                
                
                count++;
 
                
                System.out.println(year);
            }
        }
    }
}