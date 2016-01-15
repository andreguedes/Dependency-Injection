package br.com.andreguedes.consumer;

public interface Consumer {

	void processMessage(String msg, String rec);
	
}
