package com.bitLabs.Entity2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
	private int id;
	private String answer;
	@ManyToOne
	private Question1 ques;
	
	public Question1 getQues() {
		return ques;
	}
	public void setQues(Question1 ques) {
		this.ques = ques;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
