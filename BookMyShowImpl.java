package com;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;


public class BookMyShowImpl  implements BookMyShow{

	
	 Scanner sc = new Scanner(System.in);
	 Map<Integer, Movie> db = new LinkedHashMap<Integer , Movie>();
	 int totalCost = 0;
	 
	@Override
	public void addMovie() {
		
		db.put(1, new Movie ("KGF",10,500));
		db.put(2, new Movie ("Kantara",20,400));
		db.put(3, new Movie ("Baby",30,300));

		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMovie() {
		// TODO Auto-generated method stub
		
		Set<Integer> keys =db.keySet();
		for(int key : keys)
		{
			Movie m = db.get(key);
			System.out.println("Enter" +key+ "to book tickets for "+m.getName());
			System.out.println("Available Tikets "+m.getTickets());
			System.out.println("Cost: Rs."+m.getCost());
			
		}
	}

	@Override
	public void bookMovie() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Choice:");
		int choice = sc.nextInt();
		
		
		Movie movie = db.get(choice);
		
		if(movie!= null)
		{
			System.out.println("selected Movie is"+movie.getName());
			System.out.println("Enter the Number of Tickets");
			int tickets = sc.nextInt();
			
			if(tickets <= movie.getTickets())
			{
				System.out.println("Tickets Available");
				
				// calculating current Ticket COst
				int currentCost = tickets * movie.getCost();
				
				//Updating New TIckets Available
				movie.setTickets(movie.getTickets());
				
				//Adding current cost to totalcost -> totalCost = totalCost + currentCost
				totalCost = totalCost + currentCost;
				
				System.out.println("Bokking Successfull");
				System.out.println("**************");
				System.out.println("Movie Name"+movie.getName());
				System.out.println("no of tickets booked"+tickets);
				System.out.println("Movie Ticket Cost:"+currentCost);
				System.out.println("*************");
				
			}
			else
			{
				System.out.println("Tickets are Not Available");
			}
			
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Your Ticket Cost: Rs"+totalCost);
		
	}
	
	

}
