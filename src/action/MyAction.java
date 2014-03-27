package action;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ognl.OgnlValueStack;

/*��1��ServletResponseAware��
 * ��2��RequestAware*/
public class MyAction extends ActionSupport implements ServletResponseAware,RequestAware{
	private HttpServletResponse Response;

	private Map<String, Object> requset;
	public void excute() throws Exception{
		Set<String> keys = requset.keySet();
		for(String key:keys){
			System.out.println(key);
		}
		OgnlValueStack stack = (OgnlValueStack)requset.get("struts.valueStack");
		Response = (HttpServletResponse)stack.getContext().get(StrutsStatics.HTTP_RESPONSE);
		Response.getWriter().write("ʵ��ServletResponseAware�ӿڷ���");
	}


	public void setServletResponse(HttpServletResponse arg0) {
		this.Response = arg0;
		
	}


	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		requset = arg0;
	}

	
}
/*������
 * HttpServletResponse response(HttpServletResponse) = ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
 * HttpServletRequest request(HttpServletRequest) = ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
 * 
 * */
/*
 * ������ ��ServletActionContext.getResponse()
 * HttpServletResponse response = ServletActionContext.getResponse()
 * response.getWriter().write("hello world");*/

