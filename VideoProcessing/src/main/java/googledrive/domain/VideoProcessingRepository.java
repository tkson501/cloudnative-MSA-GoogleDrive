package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "videoProcessings",
    path = "videoProcessings"
)
public interface VideoProcessingRepository
    extends PagingAndSortingRepository<VideoProcessing, Long> {}
