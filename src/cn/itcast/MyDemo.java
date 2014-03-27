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
			this.addFieldError("msg.hello", "必须输入hello");
			this.addActionError("处理失败");
			this.addActionMessage("动作处理失败");
		}
		else{
			this.addActionError("提交成功");
			this.addActionMessage("处理成功");
		}
	}
	public String doValidate(){
		System.out.println("success");
		return SUCCESS;
	}
}
