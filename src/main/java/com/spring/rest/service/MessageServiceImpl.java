package com.spring.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.model.Message;

@Service
public class MessageServiceImpl implements MessageService {

	
	private List<Message> messages;
	
	 public MessageServiceImpl() {
		messages = new ArrayList<>();
		messages.add(new Message(1,"One"));
		messages.add(new Message(2,"Twp"));
		messages.add(new Message(3,"Three"));
		messages.add(new Message(4,"Four"));
		messages.add(new Message(5,"Five"));
		messages.add(new Message(6,"Six"));
		messages.add(new Message(7,"Seven"));
		messages.add(new Message(8,"Eight"));
		messages.add(new Message(9,"Nine"));
		messages.add(new Message(10,"Ten"));
	}
	
	
	@Override
	public List<Message> getAllMessage() {
		
		return messages;
	}

	@Override
	public Message FindById(Integer id) {
		for(Message m:messages){
			if(m.getId() ==id){
				return m;
			}
		}
		return null;
	}

	@Override
	public boolean createMessage(Message message) {
		return messages.add(message);		
		
	}

	@Override
	public void removeMessage(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

}
