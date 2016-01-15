package br.com.andreguedes.injector;

import br.com.andreguedes.consumer.Consumer;
import br.com.andreguedes.consumer.MyIDApplication;
import br.com.andreguedes.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		/*MyIDApplication app = new MyIDApplication();
		app.setService(new EmailServiceImpl());
		return app;*/
		
		return new MyIDApplication(new EmailService());
	}

}
