package funciones;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * This utility class provides a functionality to send an HTML e-mail message
 * with embedded images.
 * @author www.codejava.net
 *
 */
public class EmbeddedImageEmailUtil {

	/**
	 * Sends an HTML e-mail with inline images.
	 * @param host SMTP host
	 * @param port SMTP port
	 * @param userName e-mail address of the sender's account 
	 * @param password password of the sender's account
	 * @param toAddress e-mail address of the recipient
	 * @param subject e-mail subject
	 * @param htmlBody e-mail content with HTML tags
	 * @param mapInlineImages 
	 * 			key: Content-ID
	 * 			value: path of the image file
	 * @throws AddressException
	 * @throws MessagingException
	 */
	final static String senderEmailID = "hotelsolutionsweb@gmail.com";
	final static String senderPassword = "hotelsolutions1234";
	final static String emailSMTPserver = "smtp.gmail.com";
	final static String emailServerPort = "587";
	
	
	public static void send( String toAddress,
			String subject, String htmlBody, 
			Map<String, String> mapInlineImages)
				throws AddressException, MessagingException {
		
		
		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", emailSMTPserver);
		properties.put("mail.smtp.port", emailServerPort);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.user", senderEmailID);
		properties.put("mail.password", senderPassword);

		// creates a new session with an authenticator
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmailID, senderPassword);
			}
		};
		Session session = Session.getInstance(properties, auth);

		// creates a new e-mail message
		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(senderEmailID));
		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject(subject);
		msg.setSentDate(new Date());

		 BodyPart htmlPart = new MimeBodyPart();
	        htmlPart.setContent(htmlBody, "text/html");

		// creates message part
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(htmlBody, "text/html");

		// creates multi-part
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(htmlPart);

		// adds inline image attachments
		if (mapInlineImages != null && mapInlineImages.size() > 0) {
			Set<String> setImageID = mapInlineImages.keySet();
			
			for (String contentId : setImageID) {
				MimeBodyPart imagePart = new MimeBodyPart();
				imagePart.setHeader("Content-ID", "<" + contentId + ">");
				imagePart.setDisposition(MimeBodyPart.INLINE);
				
				String imageFilePath = mapInlineImages.get(contentId);
				try {
					imagePart.attachFile(imageFilePath);
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				multipart.addBodyPart(imagePart);
			}
		}

		msg.setContent(multipart);

		Transport.send(msg);
	}
}