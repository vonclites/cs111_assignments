import java.util.*;
import java.io.*;
 
public class ReadIntsExample {
 public static void main(String[] args)throws IOException{
   Scanner in = new Scanner(new FileReader("data/data1.txt"));
   int count = 0;
   int value=0;
  
   while( in.hasNext()){
    value = in.nextInt();
    count++;
    System.out.println(count);
   }
   in.close();
 } 
}