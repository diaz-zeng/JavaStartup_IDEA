package edu.diaz.exam.day7.exam2;

public class Duration
{
	private int hours, minutes, seconds;

	public Duration(int hour, int minutes, int seconds)
	{
		// TODO Auto-generated constructor stub
		this.hours = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getTotalSeconds()
	{
		int result = 0;
		result = (hours * 3600) + (minutes * 60) + seconds;
		return result;
	}

	@Override
	public String toString()
	{
		String result = "";
		result = new String(hours + ":" + minutes + ":" + seconds);
		return result;
	}
}
