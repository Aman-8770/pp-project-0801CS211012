import java.util.*;
class exception1{
public static void main(String[] args){
 int a=10,b=0,c;
 int arr[] = new int[5];
 String s = null;
 try{
     c = a/b;
     System.out.println(c);
 }
 catch(Exception e){
        e.printStackTrace();
 }
 try{
      arr[8]=8;
 }
 catch(Exception e){
      e.printStackTrace();
 }
 try{
        if(s.equals("aman")){
              System.out.println("yes they are same");
        }      
 }
 catch(Exception e){
        e.printStackTrace();
 }
}
}