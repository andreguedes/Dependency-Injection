package br.com.andreguedes.consumer;

import br.com.andreguedes.service.MessageService;

public class MyIDApplication implements Consumer {
	
	private MessageService service;
	
	/*public MyIDApplication() {
		
	}
	
	public void setService(MessageService service) {
		this.service = service;
	}*/
	
	public MyIDApplication(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMessage(String msg, String rec) {
		this.service.sendMessage(msg, rec);
	}

}
