package githubpro111;

public class gitforloop {
    public static void main(String[] args) {
		int n=4;
		int m=5;
		//star pattern program....
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==n||j==m||i==1||j==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}


