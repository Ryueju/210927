package co.eju.prj;

public class ForTest {

	private int n;
	private int m;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	private void sum() {
		int sum = 0;

		for (int i = n; i < m; i++) {
			sum = sum += i;
		}

		System.out.println(" 두 정수 사이의 합은 = " + sum);
	}

	public void run() {
		sum();
	}
}
