package importorg.test.login;

class calculator
{
	public int add(int i,int j) {

		  return i+j;
	
}
}

class advcalculator extends calculator
{
	 public int sub(int i ,int j) {
	 
	 
	 return i-j;

}
}


class veryadvcalculator extends advcalculator
{
	public int multi(int i ,int j) {
		return i*j;
		
	}
	
}

public  class Multipleinheritance 
{
	
	public static void main(String[] args) {
	

	veryadvcalculator c1=new veryadvcalculator();
		int result1=c1.add(5,4);
		int result2 =c1.sub(5,4);
		int result3 =c1.multi(6,4);
		
		System.out.print(result1);
		System.out.print(result2);
		System.out.print(result3);
					
	

}
}



