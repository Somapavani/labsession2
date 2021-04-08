class Studentt
{
 private int regno;
 private String name;
 Studentt(int regno,String name)
 {
  this.regno=regno;
  this.name=name;
  }
  public void display()
  {
   System.out.println("Register No:"+regno);
   System.out.println("Name:"+name);
   }  
class SDemo
{
 public static void main(String a[])
 {
  Studentt s1=new Studentt(101,"Pavani");
  Studentt s2=new Studentt(102,"Bujji");
  s1.display();
  s2.display();
 }
}