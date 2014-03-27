package action;

import com.opensymphony.xwork2.ActionSupport;

public class NewValidateAction extends ActionSupport
{
    private String name;  // 必须输入
    private int age;   // 在13和20之间
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
    	System.out.println("msg is :"+name);
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
    	System.out.println("age is :"+age);

        this.age = age;
    }
}