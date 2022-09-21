package googledrive.domain;

import googledrive.NotificationApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NotificationMgmt_table")
@Data
public class NotificationMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static NotificationMgmtRepository repository() {
        NotificationMgmtRepository notificationMgmtRepository = NotificationApplication.applicationContext.getBean(
            NotificationMgmtRepository.class
        );
        return notificationMgmtRepository;
    }

    public static void notify(VideoStreamingProcessed videoStreamingProcessed) {
        /** Example 1:  new item 
        NotificationMgmt notificationMgmt = new NotificationMgmt();
        repository().save(notificationMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoStreamingProcessed.get???()).ifPresent(notificationMgmt->{
            
            notificationMgmt // do something
            repository().save(notificationMgmt);


         });
        */

    }

    public static void notify(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        NotificationMgmt notificationMgmt = new NotificationMgmt();
        repository().save(notificationMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notificationMgmt->{
            
            notificationMgmt // do something
            repository().save(notificationMgmt);


         });
        */

    }
}
