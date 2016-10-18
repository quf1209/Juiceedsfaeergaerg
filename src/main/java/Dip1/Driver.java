package Dip1;

public class Driver{
	private Drawable drawable;
	
	public void setDrawable(Drawable drawable)
	{
		this.drawable=drawable;
	}
	
	public void drive()
	{
		drawable.engineOn();
		drawable.go();
		drawable.engineOff();
	}
}
