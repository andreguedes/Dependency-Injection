package br.com.andreguedes.service;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS enviado para " + receiver + " com a mensagem: " + message);
	}

}