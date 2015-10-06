package Arrays;

import java.util.Scanner;

public class NextPrime {
 public static void main(String[] args)
 {
	 Scanner in = new Scanner(System.in);
	 int no = in.nextInt();
	 NextPrime ne = new NextPrime();
	 ne.checkPrine(no);
	 in.close();  
 }
 public void  checkPrine(int no)
 {
	 while(!isPrime(no))
	 {
		no++; 
	 }
	 System.out.println("Next Prime no"+ no);
 }
public boolean  isPrime(int no) {
	if(no%2==0) return false;
	for(int i=3;i*i<no;i++)
	{
	 if(no%i==0) 
		 {
		 return false;
		 }
	}
	return true;
}
}
