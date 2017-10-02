package rmontag.springbootyaml;

// Nested properties need not be annotated
// @ConfigurationProperties(prefix =
// "available-payment-channels-list.channelConfigurations")
// @Configuration
public class ChannelConfiguration {

	private String name;
	private String companyBankAccount;

	public ChannelConfiguration(String name, String companyBankAccount) {
		this.name = name;
		this.companyBankAccount = companyBankAccount;
	}

	public ChannelConfiguration() {
	}

	// getters, setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyBankAccount() {
		return companyBankAccount;
	}

	public void setCompanyBankAccount(String companyBankAccount) {
		this.companyBankAccount = companyBankAccount;
	}

}
