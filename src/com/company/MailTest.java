package com.company;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class MailTest {
    public static void main(String[] args) {
        String to = "805331263@qq.com";
        String from = "gaosy@kmelearning.com";
        String server = "smtp.exmail.qq.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", server);
        properties.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the Subject Line!");

//            message.setText("This is actual message");
//            message.setContent("<h1>This is html message</h1>", "text/html");

            Multipart multipart = new MimeMultipart();
            BodyPart messageBody = new MimeBodyPart();
            messageBody.setText("This is message body");
            multipart.addBodyPart(messageBody);
            messageBody = new MimeBodyPart();
            String file = "a.txt";
            DataSource dataSource = new FileDataSource(file);
            messageBody.setDataHandler(new DataHandler(dataSource));
            messageBody.setFileName(file);
            multipart.addBodyPart(messageBody);
            message.setContent(multipart);


            Transport transport = session.getTransport();
            transport.connect(server, from, "");
            transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transport.close();
            System.out.println("Sent message successfully...");
        } catch (MessagingException m) {
            m.printStackTrace();
        }
    }
}
