
public class GFG {
	static void towerOfHanoi(int n,char from_rod,char use_rod,char to_rod,char aux_rod,char us_rod)
	{
		if(n==1) 
		{ 
			System.out.println("Move disk 1 from rod  "  +  from_rod +" to rd " + to_rod+" ");
			return;
		}
		towerOfHanoi(n-1,from_rod,aux_rod,use_rod,us_rod,to_rod);
		System.out.println("Move disk "+n+  " from rod  "+from_rod+" to_rod  "+to_rod);
		towerOfHanoi(n-1,aux_rod,to_rod,from_rod,us_rod,use_rod);
	}
	public static void main(String[] args) {
		int n=5;
		towerOfHanoi(n,'A','B','C','D','E');

	}

}
