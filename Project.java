class Project
{
 private String studenttype;
 private String labname;
 public student(String studenttype,String labname)
 {
  this.studenttype=studenttype;
  this.labname=labname;
  }
  void display 
  {
System.out.println("student type is :"+studenttype);
System.out.printl("labname is:"+labname);
}
}
class college extends student
{
public college(String studenttype,String labname)
{
super(studenttype,labname);
}
public void display()
{
super.display();
}
}
class inheritance
{
public static void main(String a[])
{
student s1=new college("science student","Practicals");
student s2=new college("art student","Project");
s1.display();
s2.display();
}