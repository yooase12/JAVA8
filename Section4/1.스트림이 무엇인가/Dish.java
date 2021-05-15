package study;

public class Dish {
	private int calrories;
	private String name;
	@Override
	public String toString() {
		return "Dish [calrories=" + calrories + ", name=" + name + "]";
	}
	public int getCalrories() {
		return calrories;
	}
	public void setCalrories(int calrories) {
		this.calrories = calrories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Dish(int calrories, String name) {
		super();
		this.calrories = calrories;
		this.name = name;
	}
	
	
}
