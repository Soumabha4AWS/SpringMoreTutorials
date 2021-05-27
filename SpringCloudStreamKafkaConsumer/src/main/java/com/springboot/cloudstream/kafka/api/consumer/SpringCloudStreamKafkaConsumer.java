package com.springboot.cloudstream.kafka.api.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.springboot.cloudstream.kafka.api.consumer.dao.Book;


@EnableBinding(Sink.class)
@RestController

public class SpringCloudStreamKafkaConsumer {
	
	Book response ;
	
	private Logger logger = LoggerFactory.getLogger(SpringCloudStreamKafkaConsumer.class);
	
	@Autowired
    private SubscribableChannel input;
	
	@StreamListener("input")		
    public void consumeMessage(Book book) {        
		response = book;
		logger.info("Consume payload : " + book);
    }

	@GetMapping("/subscribe")
    public Book subscribeEvent() {	        
        return response;
    }
	
	
	@GetMapping("/testSubscribe")
    public String subscribeTest() {	        
        return "tested Subscribe";
    }
	
	
}
