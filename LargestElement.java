class LargestElement
{
 public static void main(String arg[])
  {
   int [] arr=new int [] {10,20,22,15,9,30};
   int max = arr[0];
   for (int i=0;i<arr.length;i++)
   {
    if (arr[i]>max)
    max=arr[i];
    }
    System.out.println("Largest element present in given array:" +max);
  }
}