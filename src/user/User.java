package user;

import java.util.*;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.*;
import javax.mail.internet.*;

import mailer.RegAuthenticator;


public class User {
	
	public String primaryemail="nabil.adrar@gmail.com";
	public String secondaryemail="malek.karki.reggae@gmail.com";
	public String secondarypassword=",;:!,;:!";
	public String smtp_auth="true";
	public String smtp_host="smtp.gmail.com";
	public String smtp_port="587";
	public String smtp_starttls="true";
	public String store_protocol="imaps";
	public String imap_host="imap.googlemail.com";
	private MailAccount account;
	
	public User (String primaryemail, String secondaryemail, String secondarypassword) {
		this.primaryemail      = primaryemail;
		this.secondaryemail    = secondaryemail;
		this.secondarypassword = secondarypassword;
	}

	public Properties getProperties() {
		return account.getProperties();
	}
	
	public MailAccount getMailAccount() {
		return this.account;
	}
	
	public Session getSession() {
	    javax.mail.Authenticator authenticator = new RegAuthenticator(this);
	    return Session.getDefaultInstance(getProperties(),authenticator);
	}
	

}
