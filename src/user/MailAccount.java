package user;

import java.util.Properties;

public interface MailAccount {
	public Properties getProperties();
	public String getStoreProtocol();
	public String getImapHost();
	public String getMail();
	public String getPassword();
}
