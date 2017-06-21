package lab.aikibo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by tamami on 21/06/17.
 */
@Component
public class Receiver {

    @RabbitListener(queues = "TestQ")
    public void processMessage(String content) {
        System.out.println(content);
    }

}
