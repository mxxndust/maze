package pth;

public class Cell {
	private boolean n;
	private boolean s;
	private boolean w;
	private boolean e;
	private boolean prohod;
	
	public boolean isProhod() {
		return prohod;
	}
	public void setProhod(boolean prohod) {
		this.prohod = prohod;
	}
	public boolean isN() {
		return n;
	}
	public void setN(boolean n) {
		this.n = n;
	}
	public boolean isS() {
		return s;
	}
	public void setS(boolean s) {
		this.s = s;
	}
	public boolean isW() {
		return w;
	}
	public void setW(boolean w) {
		this.w = w;
	}
	public boolean isE() {
		return e;
	}
	public void setE(boolean e) {
		this.e = e;
	}

	

}
