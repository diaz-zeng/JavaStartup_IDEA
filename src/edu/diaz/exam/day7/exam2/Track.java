package edu.diaz.exam.day7.exam2;

public class Track
{
	private String title;
	private Duration duration;
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "my Track title is: " + title + " duration is: " + duration;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public Duration getDuration()
	{
		return duration;
	}
	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}
}
