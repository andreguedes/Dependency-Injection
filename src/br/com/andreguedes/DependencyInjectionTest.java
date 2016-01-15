package br.com.andreguedes;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		MyApplication app = new MyApplication(new EmailService());
		app.processMessage("Olá", "teste@hotmail.com");
	}
}
