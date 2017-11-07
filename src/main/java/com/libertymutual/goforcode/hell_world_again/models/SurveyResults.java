package com.libertymutual.goforcode.hell_world_again.models;

public class SurveyResults {

	private int russettCount; 
	private int goldenCount;
	private int sweetCount;	
	
	public int russettTotal() {
		return russettCount;
	}
		
	public int goldenTotal() {
		return goldenCount;
	}
		
	public int sweetTotal() {
		return sweetCount;
	}
	
	public void registerRussettVote() {
		russettCount = russettCount + 1;
	}
	
	public void registerGoldenVote() {
		goldenCount = goldenCount + 1;
	}
	
	public void registerSweetVote() {
		sweetCount = sweetCount + 1;
	}
		
		
	
}
