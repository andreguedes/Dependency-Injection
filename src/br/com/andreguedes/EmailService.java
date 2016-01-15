package br.com.andreguedes;

public class EmailService {

	public void sendEmail(String message, String receiver) {
		System.out.println("Email enviado para " + receiver + " com a mensagem: " + message);
	}
	
}