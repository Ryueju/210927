package co.eju.prj;

public class CompareMax {
	
	private int n;
	private int m;
	
	public CompareMax(int n, int m) {
		this.n = n;
		this.m = m;
		
	}
	
	public int compareMax() {
		int max = 0;
		if(n>m) {
			max = n;
		} else if (n<m) {
			max = m;
			
		}
		
		return max;
	}

}
