package br.com.andreguedes.service;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Email enviado para " + receiver + " com a mensagem: " + message);
	}

}
