package com.bitLabs.Entity2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
	private int id;
	private String questionn;
	@OneToMany(mappedBy="ques")
	private List<Answer1> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionn() {
		return questionn;
	}
	public void setQuestionn(String questionn) {
		this.questionn = questionn;
	}
	public List<Answer1> getAns() {
		return ans;
	}
	public void setAns(List<Answer1> ans) {
		this.ans = ans;
	}
	
}
