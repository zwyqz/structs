package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class UploadAction extends ActionSupport {
	private File upload;  //上传的文件数据
	private String uploadFileName; //默认的文件名字为uploadFileName为上传文件的一个请求
	private String uploadContentType;
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContenType) {
		this.uploadContentType = uploadContenType;
	}
	public String upload() throws Exception
	{
		
		String realpath = ServletActionContext.getServletContext().getRealPath("/upload");//获取绝对路径
		System.out.println(realpath);//
		if(upload !=null){
			File saveFile = new File(new File(realpath),uploadFileName);
			if(!(saveFile.getParentFile().exists()))
				saveFile.getParentFile().mkdirs(); //创建文件路径
			FileUtils.copyFile(upload, saveFile); //将上传文件进行缓存
			ActionContext.getContext().put("message", "上传成功"); //返回消息
		}
		return SUCCESS;
	}
}
