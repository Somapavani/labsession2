class Employee
 {
  private int id;
  private String name;
  Employee(int id,String name)
  {
   this.id=id;
   this.name=name;
   }
   public void display()
   {
   System.out.println("Employee Id:"+id);
   System.out.println(" Name:"+name);
   }
  }
  class Edemo5
  {
   public static void main(String arg[])
  {
   Employee e1=new Employee(1,"Pav");
   Employee e2=new Employee(2,"Soma");
    e1.display();
    e2.display();
  }
}