package com.project.offer.firstspamertasker.services;



import com.project.offer.firstspamertasker.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ConsumerForNewUser {
    private static Logger log = Logger.getLogger(PostTaskService.class.getName());

    @Autowired
    private PostTaskService postTaskService;

    @KafkaListener(topics = "${spring.kafka.newUserTopic}", groupId = "${spring.kafka.groupId}")
    public void receive(@Payload User user) {
        postTaskService.sendTaskForOneUser(user);
    }

}
