class factorial{
	public static void main(String[] args){
		int n=5;
		int fact=n;
		for(int i=2;i<n;i++){
			fact*=i;
		}
		System.out.println("The factorial of 5 is " + fact);
	}
}