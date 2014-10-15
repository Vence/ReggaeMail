package user;

public class GmailMailAccount extends SmtpMailAccount {

	private static String AUTH="true";
	public static String HOST="smtp.gmail.com";
	public static String PORT="587";
	public static String STARTTLS="true";
	public static String STOREPROTOCOL="imaps";
	public static String IMAP = "imap.googlemail.com";
	
	public GmailMailAccount(String mail, String password) {
		super(mail, password, AUTH, HOST, PORT, STARTTLS, STOREPROTOCOL, IMAP);
	}
	
}
