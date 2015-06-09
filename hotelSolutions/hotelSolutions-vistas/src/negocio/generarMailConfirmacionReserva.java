package negocio;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import funciones.EmbeddedImageEmailUtil;

public class generarMailConfirmacionReserva {

	public static boolean generarMailConfirmacionReserva(String workingDirectory, long numReserva, String nombre, String apellido, String email, String fechaDesde, String fechaHasta, String tipoHab) {

		System.out.println(email);
		String mailTo = email;
		String subject = "email de confirmacion";

		String separador = System.getProperty("file.separator");
		String rutaAbsolutaHeader = workingDirectory + "headerMailConfirmacionReserva.html";
		String rutaAbsolutaFooter = workingDirectory + "footerMailConfirmacionReserva.html";
		String headerHtml = "";
		String footerHtml = "";
		String mailHtml = "";
		// inline images
		Map<String, String> inlineImages = new HashMap<String, String>();
		
		File header = new File(rutaAbsolutaHeader);
		File footer = new File(rutaAbsolutaFooter);

		try {
			headerHtml = Files.toString(header, Charsets.UTF_8);
			footerHtml = Files.toString(footer, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String body = "<table style='caption-side:bottom;text-align: left;'>"
				+ "<tr>"
				+ "<th> Reserva N°</th><th>Nombre y apellido</th><th>fecha Desde</th><th>fecha Hasta</th><th>Tipo de habitación</th> "
				+ "<tr> "
				+ "<td>"+numReserva+"</td><td>"+nombre+" "+apellido+"</td><td>"+fechaDesde+"</td><td>"+fechaHasta+"</td><td>"+tipoHab+"</td> "
				+ "<tr> " + "</table>";

		mailHtml = headerHtml + body + footerHtml;

		try {
			EmbeddedImageEmailUtil
					.send(mailTo, subject, mailHtml, inlineImages);
			System.out.println("Email sent.");
			return true;
		} catch (Exception ex) {
			System.out.println("Could not send email.");
			ex.printStackTrace();
			return false;
		}

	}

}
