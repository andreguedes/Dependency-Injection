package br.com.andreguedes.test;

import br.com.andreguedes.consumer.Consumer;
import br.com.andreguedes.injector.EmailServiceInjector;
import br.com.andreguedes.injector.MessageServiceInjector;
import br.com.andreguedes.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Texto exemplo para o email";
		String email = "teste@hotmail.com";
		String phone = "85454552";
		
		MessageServiceInjector injector = null;
		Consumer consumer = null;
		
		// servico de email
		injector = new EmailServiceInjector();
		consumer = injector.getConsumer();
		consumer.processMessage(msg, email);
		
		// servico de SMS
		injector = new SMSServiceInjector();
		consumer = injector.getConsumer();
		consumer.processMessage(msg, phone);
	}
	
}
