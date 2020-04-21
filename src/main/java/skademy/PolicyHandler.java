package skademy;

import skademy.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseCanceled_결제취소(@Payload CourseCanceled courseCanceled){
        if(courseCanceled.isMe()){
//            System.out.println("##### listener 결제취소 : " + courseCanceled.toJson());
            System.out.println("강의 " + courseCanceled.getId() + "번 취소되었습니다.");


    }
    }

}
