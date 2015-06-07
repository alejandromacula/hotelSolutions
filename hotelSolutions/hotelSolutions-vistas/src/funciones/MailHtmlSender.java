package funciones;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import funciones.MailSender.SMTPAuthenticator;

public class MailHtmlSender {

	final String senderEmailID = "hotelsolutionsweb@gmail.com";
	final String senderPassword = "hotelsolutions1234";
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";

	String receiverEmailID = null;
	String emailSubject = null;
	String emailBody = null;

	public MailHtmlSender(String receiverEmailID, String emailSubject,
			String emailBody) {
		this.receiverEmailID = receiverEmailID;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;

		Properties props = new Properties();
		props.put("mail.smtp.user", senderEmailID);
		props.put("mail.smtp.host", emailSMTPserver);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", emailServerPort);
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		SecurityManager security = System.getSecurityManager();

		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			// session.setDebug(true);

			MimeMessage msg = new MimeMessage(session);
			msg.setContent(emailBody, "text/html");
			msg.setSubject(emailSubject);
			msg.setFrom(new InternetAddress(senderEmailID));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
					receiverEmailID));
			Transport.send(msg);

		} catch (Exception mex) {
			mex.printStackTrace();
		}

	}

	public class SMTPAuthenticator extends javax.mail.Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(senderEmailID, senderPassword);
		}
	}
	

}
