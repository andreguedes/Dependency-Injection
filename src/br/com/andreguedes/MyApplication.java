package br.com.andreguedes;

public class MyApplication {

	private EmailService emailService = null;
			
	public MyApplication(EmailService emailService) {
		this.emailService = emailService;
	}
			
	public void processMessage(String msg, String rec) {
		this.emailService.sendEmail(msg, rec);
	}
	
}