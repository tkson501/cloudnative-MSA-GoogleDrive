package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.VideoStreamingProcessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoProcessing_table")
@Data
public class VideoProcessing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileId;

    private String videoUrl;

    private String videoType;

    private Date processedDate;

    @PostPersist
    public void onPostPersist() {
        VideoStreamingProcessed videoStreamingProcessed = new VideoStreamingProcessed(
            this
        );
        videoStreamingProcessed.publishAfterCommit();
    }

    public static VideoProcessingRepository repository() {
        VideoProcessingRepository videoProcessingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoProcessingRepository.class
        );
        return videoProcessingRepository;
    }

    public static void ifVideoProcessStreaming(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        VideoProcessing videoProcessing = new VideoProcessing();
        repository().save(videoProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoProcessing->{
            
            videoProcessing // do something
            repository().save(videoProcessing);


         });
        */

    }
}
