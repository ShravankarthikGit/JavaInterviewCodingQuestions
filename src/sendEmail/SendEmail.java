package sendEmail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    public static void main(String[] args) {
        // 1. Setup recipient and sender details
        String to = "n.shravankarthik@gmail.com";
        String from = "n.shravankarthik@gmail.com";
        
        // 2. SMTP Server Settings
        // If using Gmail, use "smtp.gmail.com". "localhost" requires a local server.
        String host = "smtp.gmail.com"; 

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465"); // Port for SSL
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // 3. Get the Session object with authentication
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // Use a Google "App Password" here, NOT your regular password
                return new PasswordAuthentication("your-email@gmail.com", "your-app-password");
            }
        });

        // 4. Compose and Send the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Ping");
            message.setText("Hello, this is an example of sending email.");

            Transport.send(message);
            System.out.println("Message sent successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}