 class calculator     // super class

{
  public int add(int i,int j) {

	  return i+j;
  }
} 

 
 class adv extends calculator  //sub class
 {
 
	 public int sub(int i ,int j) 
{
 return i-j;
 }
 }

public class Inheritance {
	
	public static void main(String[] args) {
adv c1=new adv();
int result1=c1.add(5, 4);
int result2=c1.sub(5, 4);
System.out.print(result1);
System.out.print(result2);	
}
	}
	





