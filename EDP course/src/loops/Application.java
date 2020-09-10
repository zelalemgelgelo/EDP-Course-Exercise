package loops;

import java.util.Calendar;

public class Application {
	
    public static void main(String[] args) {
        
        int value = 0;
    
        while(value < 10)
        {
            System.out.println("Hello " + value);
            
            value = value + 1;
        }
    	Calendar cal = Calendar.getInstance();
        int res = cal.getActualMaximum(Calendar.DATE);
        int res2 = cal.getActualMinimum(Calendar.DATE);
        int res3 = cal.getActualMinimum(Calendar.DAY_OF_WEEK);
        int res4 = cal.getActualMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Today's Date = " + cal.getTime());
        System.out.println("Last Date of the current month = " + res);
        System.out.println("Last Date of the current month = " + res2);
        System.out.println("Last Date of the current month = " + res3);
        System.out.println("Last Date of the current month = " + res4);
    }
}

 