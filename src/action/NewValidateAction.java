package action;

import com.opensymphony.xwork2.ActionSupport;

public class NewValidateAction extends ActionSupport
{
    private String name;  // ��������
    private int age;   // ��13��20֮��
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