/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Properties;
 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author dipikam
 */
public class MailNew {
    
    Session mailSession;
    String emailto;
    String subject;
    String body;
    
    public MailNew(String emailto,String subject,String body) throws MessagingException {
        this.emailto=emailto;
        this.subject=subject;
        this.body=body;
        setMailServerProperties();
        sendEmail();
    }

    private void setMailServerProperties()
    {
        Properties emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.starttls.enable", "true");
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        
        mailSession = Session.getDefaultInstance(emailProperties, null);
    }
 
    private MimeMessage draftEmailMessage() throws AddressException, MessagingException
    {
        String[] toEmails = { emailto };
        String emailSubject = subject;
        String emailBody = body;
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for(int i = 0; i < toEmails.length; i++){
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }
 
    private void sendEmail() throws AddressException, MessagingException
    {
        
        String fromUser = "demomailaed@gmail.com";
        String fromUserEmailPassword = "demomailaed1!";
 
        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessage();
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
}
    
    
    
    

