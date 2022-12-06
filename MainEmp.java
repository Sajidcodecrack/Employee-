package Company.Salary;
import java.util.*;

public class MainEmp {
    public static Employ[] employs= new Employ[30];
    public static int n=0;
    public static void updateSalary(float r)
    {
        for(int i=0;i<n;i++)
        {
            employs[i].setsalary(employs[i].getsalary()+employs[i].getsalary()*(r/100));
            System.out.println(employs[i].toString());
        }
    }
    public static void searchByGender(char g)
    {
        for(int i=0;i<n;i++)
        {
            if(g==employs[i].getgender())
            {
                System.out.println(employs[i].toString());
            }
        }
    }
    public static boolean alreadyExist(Employ e)
    {
        if(n==0)
        {
            return false;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(employs[i].equals(e))
                {
                    return true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
       while(true)
       {
        System.out.println("*************************** MENU **************************"); 
        System.out.println("Press '1' for continue :");
        System.out.println("Press '2' for search by gender :");
        System.out.println("Press '3' for update salary: ");
        System.out.println("Press '4' for show all the information:");
        System.out.println("Press '0' for exit :");
        System.out.println("************** Press number from the following instruction:******************"); 
        Scanner emp= new Scanner(System.in);
        int res= emp.nextInt();
        if(res==1)
        {
        System.out.println("Collecting information from user:");
        System.out.println("Enter user id:");
        String ID=emp.next();
        System.out.println("Enter your name :");
        String name=emp.next();
        System.out.println("Enter your age:");
        int age=emp.nextInt();
        System.out.println("Enter your gender:");
        char gen=emp.next().charAt(0);
        System.out.println("Enter your monthly salary:");
        float sal=emp.nextFloat();
        Employ b= new Employ(ID, name, age, gen, sal);
        if(!alreadyExist(b))
        {
            employs[n++]=b;
        }
  
        
        
       }
       else if(res==0)
       {
        break;
       }
       else if(res==2)
       {
        System.out.println(" Use gender to search information about user :");
        char gen=emp.next().charAt(0);
        searchByGender(gen);
       }
       else if(res==3)
       {
        System.out.println("Enter the new rate :");
        float rate=emp.nextFloat();
        updateSalary(rate);
       }
       else if(res==4)
       {
        System.out.println("Showing the user details :");
        for(int i=0;i<n;i++)
        {
            System.out.println(employs[i].toString());
        }
       }
 
     }
        }
    
      }
    
      


