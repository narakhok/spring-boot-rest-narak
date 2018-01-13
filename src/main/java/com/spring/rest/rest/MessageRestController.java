package com.spring.rest.rest;

import java.util.List;

import javax.validation.constraints.Past;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.Message;
import com.spring.rest.service.MessageService;

//@RestController = @Controller + @ResponseBody
@Controller
public class MessageRestController {

	@Autowired
	private MessageService messageService;

	@ResponseBody
	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		return messageService.getAllMessage();

	}
	@ResponseBody
	@GetMapping("messages/{id}")
	public Message getMessageById(@PathVariable Integer id) {
		return messageService.FindById(id);
	}
	@ResponseBody
	@PostMapping("/messages")
	public boolean createMessage(@RequestBody Message message){
		return messageService.createMessage(message);
	}
}
