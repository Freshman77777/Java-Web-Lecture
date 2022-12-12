package ch07;

import java.time.LocalDate;

public class Player {
	 private int backNumber;
	 private String name;
	 private String position;
	 private LocalDate birDate;
	 private int height;
	 private int isDeleted;
	
	 
	 
	 Player() {}
	 Player(int backNumber, String name, String position, LocalDate birDate, int height, int isDeleted) {
		 this.backNumber = backNumber;
		 this.name = name;
		 this.position = position;
		 this.birDate = birDate;
		 this.height = height;
		 this.isDeleted = isDeleted;
	 }
	
	  Player(int backNumber, String name, String position, LocalDate birDate, int height) {
		 this.backNumber = backNumber;
		 this.name = name;
		 this.position = position;
		 this.birDate = birDate;
		 this.height = height;
	 }
	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public LocalDate getBirDate() {
		return birDate;
	}
	public void setBirDate(LocalDate birDate) {
		this.birDate = birDate;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Player [backNumber=" + backNumber + ", name=" + name + ", position=" + position + ", birDate=" + birDate
				+ ", height=" + height + ", isDeleted=" + isDeleted + "]";
	}
	
	}