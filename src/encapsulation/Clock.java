package encapsulation;

public class Clock {
	private int hr,min,sec;
	
	public void setClock(int hr, int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		System.out.printf("%02d:%02d:%02d",hr,min,sec);
	}
}
