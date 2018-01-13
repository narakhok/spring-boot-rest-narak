package com.spring.rest.service;

import java.util.List;

import com.spring.rest.model.Message;

public interface MessageService {

	public List<Message> getAllMessage();

	public Message FindById(Integer id);

	public boolean createMessage(Message message);

	public void removeMessage(Integer id);

	public void updateMessage(Message message);

}
