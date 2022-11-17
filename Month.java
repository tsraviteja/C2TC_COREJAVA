package com.cg.fudamentals;

public enum Month {
jan(31),feb(28),mar(31),apr(30),may(31),jun(30),jul(31),aug(31),sep(30),oct(31),nov(30),dec(30);
	private int days;

	private Month(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
}
