package cn.itcast;

import com.opensymphony.xwork2.ActionSupport;

public class MyDemo extends ActionSupport{
	private String msg ;
	

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String my(){
		return "my";
	}
	public void validate(){
		System.out.println("validate");
		System.out.println("Input :"+INPUT);
		if(msg != null && !msg.contains("Hello")){
			this.addFieldError("msg.hello", "��������hello");
			this.addActionError("����ʧ��");
			this.addActionMessage("��������ʧ��");
		}
		else{
			this.addActionError("�ύ�ɹ�");
			this.addActionMessage("����ɹ�");
		}
	}
	public String doValidate(){
		System.out.println("success");
		return SUCCESS;
	}
}
