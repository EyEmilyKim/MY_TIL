package y22.m08.app.scheduler;

public class OneDayEvent extends Event {
	public MyDate date;
	
	public OneDayEvent(String title, MyDate date){
		super(title);
		this.date = date;
	}
	
	public String toString() {
		return title + ", " + date.toString();
	}
}
