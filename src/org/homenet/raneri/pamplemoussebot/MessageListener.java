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
		
		if (content.equals("test")) {
			new MessageBuilder(Globals.client).withChannel(channel).withContent("Testing!");
		}
		
	}
	
}
