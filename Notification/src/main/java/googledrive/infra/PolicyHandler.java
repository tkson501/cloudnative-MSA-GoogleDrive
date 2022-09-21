package googledrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationMgmtRepository notificationMgmtRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VideoStreamingProcessed'"
    )
    public void wheneverVideoStreamingProcessed_Notify(
        @Payload VideoStreamingProcessed videoStreamingProcessed
    ) {
        VideoStreamingProcessed event = videoStreamingProcessed;
        System.out.println(
            "\n\n##### listener Notify : " + videoStreamingProcessed + "\n\n"
        );

        // Sample Logic //
        NotificationMgmt.notify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_Notify(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener Notify : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        NotificationMgmt.notify(event);
    }
    // keep

}
