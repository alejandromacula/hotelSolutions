package test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import funciones.EmbeddedImageEmailUtil;

public class testEnviarMailConImagenes {

	public static void main(String[] args) {
		 
        // message info
        String mailTo = "alejandro_93_7@hotmail.com";
        String subject = "Test e-mail with inline images";
        
        
        String separador= System.getProperty("file.separator");
		String workingDirectory = System.getProperty("user.dir");
		String rutaAbsolutaHeader=workingDirectory+separador+"WebContent"+separador+"headerMailConfirmacionReserva.html";
		String rutaAbsolutaFooter=workingDirectory+separador+"WebContent"+separador+"footerMailConfirmacionReserva.html";
		String headerHtml="";
		String footerHtml="";
		String mailHtml="";
		System.out.println(rutaAbsolutaHeader);
        // inline images
        Map<String, String> inlineImages = new HashMap<String, String>();
        inlineImages.put("the-img-1", workingDirectory+separador+"WebContent"+separador+"assets"+
        separador+"img"+separador+"ui-danro.jpg");
        
        inlineImages.put("image2", workingDirectory+separador+"WebContent"+separador+"assets"+
        separador+"img"+separador+"mail"+separador+"article1.png");
        
        File header=new File(rutaAbsolutaHeader);
        File footer=new File(rutaAbsolutaFooter);
        
        try {
			headerHtml = Files.toString(header, Charsets.UTF_8);
			footerHtml = Files.toString(footer, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
 
        
        String body="<br><br><table style='caption-side:bottom;text-align: left;'>"+
"<tr>"+ 
"<th>Nombre y apellido</th><th>fecha Desde</th><th>fecha Hasta</th><th>Tipo de habitación</th> "+ 
"<tr> "+ 
"<td>alejandro macula</td><td>02/01/2015</td><td>02/01/2015</td><td>habitacion base doble</td> "+ 
"<tr> "+ 
"</table>";
        
        
        mailHtml=headerHtml+body+footerHtml;
        
        try {
            EmbeddedImageEmailUtil.send(mailTo, subject, mailHtml, inlineImages);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Could not send email.");
            ex.printStackTrace();
        }
		
		
		
	}

}
