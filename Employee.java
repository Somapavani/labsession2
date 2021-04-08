class Employee
 {
  private String eid;
  private String ename;
  employee(String eid,String ename);
  {
   this.eid=eid;
   this.ename=ename;
   }
   public void display()
   {
   System.out.println("email id:"+eid);
   System.out.println("e name:"+ename);
   }
  }
  class SDemo5
  {
   public static void main(String arg[])
  {
  employee e1=new employee("Pav@gmail.com","Pav");
  employee e2=new employee("Pavs@gmail.com","Pavs");
  e1.display();
  e2.display();
  }
}