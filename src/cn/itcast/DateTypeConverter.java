package cn.itcast;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateTypeConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try { 
			if(toType == Date.class){//���ַ�����Date����ת��ʱ
				String[] params = (String[]) value;// request.getParameterValues()
				System.out.println(params[0]);
				System.out.println(dateFormat.parse(params[0]));
				return dateFormat.parse(params[0]);
			}else if(toType == String.class){//��Dateת�����ַ���ʱ
				Date date = (Date) value;
				return dateFormat.format(date);
			}
		} catch (ParseException e) {}
		return null;
	}
}
