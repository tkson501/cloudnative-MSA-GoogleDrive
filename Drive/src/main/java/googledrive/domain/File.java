package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
