class Employee extends Member
{
    public static void main (String args[])
    {
        Employee e = new Employee();
        System.out.println(e.name = "Anja");
        e.age = 7;
        e.mo_num = 930;
        e.address = "Mumfordganj";
        
        e.printSalary();
    }
}