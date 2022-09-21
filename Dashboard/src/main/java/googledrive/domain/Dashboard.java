package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Float fileSize;
    private String fileName;
    private Boolean indexed;
    private Boolean uploaded;
    private String videoUrl;
    private Date regDate;
    private Long fileId;
}
