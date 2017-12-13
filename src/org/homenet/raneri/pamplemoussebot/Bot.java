package org.homenet.raneri.pamplemoussebot;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.ReadyEvent;

public class Bot implements IListener<ReadyEvent> {
	
	
	
	public static void main(String[] args) {
		
		Globals.prefix = "!";
		
		IDiscordClient client = createClient(Globals.token);
		Globals.client = client;
		EventDispatcher dispacher = Globals.client.getDispatcher();
		
		dispacher.registerListener(new MessageListener());
		dispacher.registerListener(new Bot());
	}
	
	
	
	public static class Utils {
		public static void error(String msg) {
			System.out.println("ERROR: " + msg);
		}
		public static void info(String msg) {
			System.out.println("INFO: " + msg);
		}
	}
	
	
	
	public static IDiscordClient createClient(String token) {
		ClientBuilder clientbuilder = new ClientBuilder();
		clientbuilder.withToken(token);
		try {
			return clientbuilder.login();
		} catch (Exception e) {
			Utils.error("Failed to authorize with discord! Exiting...");
			System.exit(0);
			return null;
		}
	}



	@Override
	public void handle(ReadyEvent arg0) {
		Globals.client.idle();
		Globals.client.changePlayingText("!help for help");
	}
	
}
