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
	private File upload;  //�ϴ����ļ�����
	private String uploadFileName; //Ĭ�ϵ��ļ�����ΪuploadFileNameΪ�ϴ��ļ���һ������
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
		
		String realpath = ServletActionContext.getServletContext().getRealPath("/upload");//��ȡ����·��
		System.out.println(realpath);//
		if(upload !=null){
			File saveFile = new File(new File(realpath),uploadFileName);
			if(!(saveFile.getParentFile().exists()))
				saveFile.getParentFile().mkdirs(); //�����ļ�·��
			FileUtils.copyFile(upload, saveFile); //���ϴ��ļ����л���
			ActionContext.getContext().put("message", "�ϴ��ɹ�"); //������Ϣ
		}
		return SUCCESS;
	}
}
