
public class Circle extends Shape {

	private int x, y, r;
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	//clone 이라는 함수를 사용하여 복잡한 인스턴스를 복사할 수 있다.
	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		return circle;
	}
}
