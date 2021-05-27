package com.springboot.cloudstream.kafka.api.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.cloudstream.kafka.api.producer.dao.Book;
import org.springframework.web.bind.annotation.RequestBody;



@EnableBinding(Source.class)
@RestController

public class SpringCloudStreamKafkaProducer {
	
	 @Autowired
	    private MessageChannel output;

	    @PostMapping("/publish")
	    public Book publishEvent(@RequestBody Book book) {
	        output.send(MessageBuilder.withPayload(book).build());
	        return book;
	    }
	    
	    @GetMapping("/publish")
	    public String publishTest() {
	        return "tested publish";
	    }

}
