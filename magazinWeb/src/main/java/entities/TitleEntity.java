package entities;

import javax.persistence.Entity;

@Entity
public class TitleEntity extends BaseEntity {
	
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

