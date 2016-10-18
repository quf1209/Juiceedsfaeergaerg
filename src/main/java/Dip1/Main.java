package Dip1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable plane = new Plane();
		Driver p = new Driver();
		p.setDrawable(plane);
		p.drive();
	}

}
