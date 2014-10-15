package user;

import java.util.Properties;

public class SmtpMailAccount implements MailAccount{

	private String auth;
	private String host;
	private String port;
	private String starttls;
	private String store_protocol;
	private String emailAdresse;
	private String password;
	private String imap_host;
	
	
	
	public SmtpMailAccount(String emailAddresse, String password, String auth, String host, 
			String port, String starttls, String store_protocol, String imap_host) {
		this.auth = auth;
		this.host = host;
		this.port = port;
		this.starttls = starttls;
		this.store_protocol = store_protocol;
		this.emailAdresse = emailAddresse;
		this.password = password;
		this.imap_host = imap_host;
	}
	
	@Override
	public Properties getProperties() {
		Properties props=System.getProperties();
        props.setProperty("mail.smtp.auth", auth);
        props.setProperty("mail.smtp.host", host);
        props.setProperty("mail.smtp.port", port);
        props.setProperty("mail.smtp.starttls.enable", starttls);
        props.setProperty("mail.store.protocol", store_protocol);
		return props;
	}

	@Override
	public String getStoreProtocol() {
		return store_protocol;
	}

	@Override
	public String getImapHost() {
		return this.imap_host;
	}

	@Override
	public String getMail() {
		return this.emailAdresse;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

}
