package test;

import java.io.File;
import java.io.IOException;

import funciones.MailHtmlSender;
import funciones.MailSender;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class testEnviarMail {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String separador= System.getProperty("file.separator");
		String workingDirectory = System.getProperty("user.dir");
		String rutaAbsoluta=workingDirectory+separador+"WebContent"+separador+"mailConfirmacion.html";
		String mailHtml="";
		File mail=new File(rutaAbsoluta);
		
		try {
			mailHtml = Files.toString(mail, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		MailHtmlSender enviarMail = new MailHtmlSender("alejandro_93_7@hotmail.com", "mail de prueba", mailHtml);
		
		
	
	}
	

}
