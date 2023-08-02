package com;

public class Movie {

	String name;
	int tickets;
	int cost;
	/**
	 * @param name
	 * @param tickets
	 * @param cost
	 */
	public Movie(String name, int tickets, int cost) {
		super();
		this.name = name;
		this.tickets = tickets;
		this.cost = cost;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the tickets
	 */
	public int getTickets() {
		return tickets;
	}
	/**
	 * @param tickets the tickets to set
	 */
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString()
	{
		return name;
		
	}


}