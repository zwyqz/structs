package cn.itcast;

import com.opensymphony.xwork2.ActionSupport;

public class MyList extends ActionSupport{
	/**
	 * 
	 */
	private	int operator1,operator2;
	public void setOperator1(int operator1) {
		System.out.println(operator1);
		this.operator1 = operator1;
	}
	public void setOperator2(int operator2) {
		System.out.println(operator2);

		this.operator2 = operator2;
	}
	public String mydo(){
		
		System.out.println("hello");
		return "success";
	}
	public String doMin(){
		 
		return "Min"; 
	}
	public String doSum(){
		if(getSum() < 0)
		{
			return "negative";
		}else{
			return "positive";
		}
	}
	public int getMin(){
		return Math.min(operator1, operator2);
	}
	public int getSum(){
		return operator1 + operator2 ;
	}
}
