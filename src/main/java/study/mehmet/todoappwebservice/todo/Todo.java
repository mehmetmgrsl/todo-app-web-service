package study.mehmet.todoappwebservice.todo;

import java.util.Date;

public class Todo {
	private long id;
	private String usernname;
	private String description;
	private Date targetDate;
	private boolean isDone;
	
	public Todo(long id, String usernname, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.usernname = usernname;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsernname() {
		return usernname;
	}
	public void setUsernname(String usernname) {
		this.usernname = usernname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
}
