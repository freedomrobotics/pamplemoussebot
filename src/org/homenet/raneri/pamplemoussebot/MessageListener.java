package org.homenet.raneri.pamplemoussebot;

import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.MessageBuilder;

public class MessageListener implements IListener<MessageReceivedEvent> {

	@Override
	public void handle(MessageReceivedEvent event) {
		String content = event.getMessage().getContent();
		IChannel channel = event.getMessage().getChannel();
		
		if (content.equals(Globals.prefix + "gm1")) {
			channel.sendMessage("Game Manual 1: https://firstinspiresst01.blob.core.windows.net/ftc/game-ew-manual-part-1.pdf");
		}
		
		if (content.equals(Globals.prefix + "gm2")) {
			channel.sendMessage("Game Manual 1: https://firstinspiresst01.blob.core.windows.net/ftc/game-manual-dw-part-2.pdf");
		}
		
		if (content.equals(Globals.prefix + "help")) {
			channel.sendMessage("Game Manual 1: !gm1\n" + 
								"Game Manual 2: !gm2\n");
		}
		
	}
	
}
