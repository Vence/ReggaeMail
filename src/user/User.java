package user;

import java.util.*;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.*;
import javax.mail.internet.*;

import mailer.RegAuthenticator;


public class User {
	
	public String primaryemail="cr4shxxl@gmail.com";
	private MailAccount account;
	
	public User(String primaryEmail, MailAccount mailAccount) {
		this.primaryemail = primaryEmail;
		this.account = mailAccount;
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
