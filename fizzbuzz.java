
public class fizzbuzz {
	 public static void fzbz(int k){
		 for(int i=1;i<=k;i++){
			 if(i%15 == 0)
				 System.out.print("fizzbuzz ");
			 else if(i%3 == 0)
				 System.out.print("fizz ");
			 else if(i%5 == 0)
				 System.out.print("buzz ");
			 else 
				 System.out.print(i+" ");
		 }
	 }
	public static void main(String[] args){
		fzbz(100);
	}
}
