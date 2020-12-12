package com.lec.sts15_mybatis.ticket;

public class TicketDTO {
	private String userId;
	private int ticketCount;
	
	public final String getUserId() {
		return userId;
	}
	public final void setUserId(String userId) {
		this.userId = userId;
	}
	public final int getTicketCount() {
		return ticketCount;
	}
	public final void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	
}