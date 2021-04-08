class Count
 {
  public static void main(String arg[])
  {
   try{
     int count=0,num=5643;
     while(num!=0)
     {
     //num=num/10
     num /=10;
     ++count;
     }
    }
    System.out.println("Number of digits:"+count);