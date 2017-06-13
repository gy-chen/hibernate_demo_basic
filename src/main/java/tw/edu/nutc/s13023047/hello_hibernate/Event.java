package tw.edu.nutc.s13023047.hello_hibernate;

import java.util.Date;

/**
 * Event
 * 
 * A simple POJO class.
 * 
 */
public class Event {

	private long mId;
	private String mTitle;
	private Date mDate;

	public Event() {

	}
	
	public Event(String title, Date date) {
		mTitle = title;
		mDate = date;
	}

	public Long getId() {
		return mId;
	}

	public void setId(Long id) {
		mId = id;
	}

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date date) {
		mDate = date;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}
}
