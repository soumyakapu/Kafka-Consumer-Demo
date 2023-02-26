package Kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaConsumerListner {
    @KafkaListener(topics = "NewTopic",groupId = "group_id")
    public void consume(String message){
    System.out.println("messages"+message);
    }
}
