package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamingProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String videoType;
    private Date processedDate;

    public VideoStreamingProcessed(VideoProcessing aggregate) {
        super(aggregate);
    }

    public VideoStreamingProcessed() {
        super();
    }
    // keep

}
