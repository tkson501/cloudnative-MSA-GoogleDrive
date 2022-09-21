package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamingProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String videoType;
    private Date processedDate;
}
