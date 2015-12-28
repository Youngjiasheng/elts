package com.young.elts.bean;

import java.io.Serializable;

public class ExamInfo implements Serializable {
     private String course;
     private int total;
     private int time;
     private String question;
     private User user;
     
     public ExamInfo(){
    	 
     }
     public ExamInfo(String course,int total,int time,String question){
    	 super();
    	 this.course=course;
    	 this.total=total;
    	 this.time = time;
    	 this.question=question;
     }
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		int userId=1001;
		if(userId!=user.getId()){
			userId=user.getId();
		}
		return "考试科目:"+this.course+"\t考生编号:"+userId+"\n"
				+"考题数量:"+total+"\t考试时间:"+time+"分钟";
	}

	public static void main(String[] args) {
    	 ExamInfo ex =new ExamInfo();
    	 System.out.print(ex.toString());
     }
}
