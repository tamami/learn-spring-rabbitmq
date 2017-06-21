package lab.aikibo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by tamami on 21/06/17.
 */
@Component
public class Sender {

    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue() {
        return new Queue("TestQ", false);
    }

    public void send(String message) {
        template.convertAndSend("TestQ", message);
    }

}
