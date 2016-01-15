package br.com.andreguedes.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.andreguedes.consumer.Consumer;
import br.com.andreguedes.consumer.MyIDApplication;
import br.com.andreguedes.injector.MessageServiceInjector;
import br.com.andreguedes.service.MessageService;

public class MyMessageDIJUnitTest {

	private MessageServiceInjector injector;
	
	@Before
	public void setUp() {
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				return new MyIDApplication(new MessageService() {
					
					@Override
					public void sendMessage(String message, String receiver) {
						System.out.println("Implementação MOCK do servico de envio de mensagem");
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessage("Mensagem de texto", "teste@hotmail.com");
	}
	
	@After
	public void tear() {
		injector = null;
	}
}
