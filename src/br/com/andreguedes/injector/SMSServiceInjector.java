package br.com.andreguedes.injector;

import br.com.andreguedes.consumer.Consumer;
import br.com.andreguedes.consumer.MyIDApplication;
import br.com.andreguedes.service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyIDApplication(new SMSService());
	}

}
