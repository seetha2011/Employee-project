public class Employee {
    String name;
    int age;
    String city;
    
    

    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
    
    public static void main(String args[]) {
        
        
        Employee first  = new Employee();
        Employee second  = new Employee();
        first.name = "seetha";
        second.name = "dharani";
        first.age = 25;
        second.age = 40;
        first.city = "Rome";
        second.city = "Italy";
        

        first.display();
        second.display();