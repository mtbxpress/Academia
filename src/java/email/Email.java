package email;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.opensymphony.xwork2.ActionSupport;

public class Email /*extends ActionSupport*/ {

   private String from = "academia.jjdelrom@gmail.com";
   private String password = "passacademia";
   private String to = "academia.jjdelrom@gmail.com";
   private String subject = "Registro Academia JJDELROM";
   private String body = "Desde Academia JJDELROM le damos la bienvenida: \nLa contraseña generada es:";

   static Properties properties = new Properties();
   static {
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "587");
      properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "587" );//"465"
   }
   public Email(){}
   
   public String execute() {
      String ret = SUCCESS;
      try {
           Session session = Session.getInstance(properties, 
       //  Session session = Session.getDefaultInstance(properties,  
            new javax.mail.Authenticator() {
               protected PasswordAuthentication 
               getPasswordAuthentication() {
                  return new 
                  PasswordAuthentication(from, password);
               }
            }
         );

         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.setRecipients(Message.RecipientType.TO, 
            InternetAddress.parse(to));
         message.setSubject(subject);
         message.setText(body);
         Transport.send(message);
      } catch(Exception e) {
         ret = ERROR;
         e.printStackTrace();
      }
      return ret;
   }

   public String getFrom() {
      return from;
   }

   public void setFrom(String from) {
      this.from = from;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getTo() {
      return to;
   }

   public void setTo(String to) {
      this.to = to;
   }

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getBody() {
      return body;
   }

   public void setBody(String body) {
      this.body = body;
   }

   public static Properties getProperties() {
      return properties;
   }

   public static void setProperties(Properties properties) {
      Email.properties = properties;
   }

   
}