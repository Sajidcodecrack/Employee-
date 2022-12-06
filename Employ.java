package Company.Salary;

public class Employ {
    private String Id;
    private String name;
    private int age;
    private char gender;
    private float salary;
    Employ()
    {

    }
    Employ(String Id, String name, int age, char gender, float salary)
    {
        this.Id=Id;
        this.name= name;
        this.age= age;
        this.gender=gender;
        this.salary=salary;
    }
    public void setId(String Id)
    {
        this.Id=Id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setgender(char gender)
    {
        this.gender=gender;
    }
    public void setsalary(float salary) {
        this.salary = salary;
    }
    public String getId()
    {
        return Id;
    }
    public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
    public char getgender() {
        return gender;
    }
    public float getsalary() {
        return salary;
    }

    public String toString() {

        return  " Id : " +getId()+"  Name: " + getname()+" Age : " + getage()+" Gender : "+getgender()+" Salary: "+getsalary();
    }
    public boolean equals(Employ e)
    {
        if(e.getId().equals(this.getId())
        && e.getname().equals(this.getname())
        && e.getage()==this.getage()
        && e.getsalary()==this.getsalary()
        && e.getgender()==this.getgender())
        {
            return true;
        }
        else 
        {
            return false;
        }

    
    }
}
