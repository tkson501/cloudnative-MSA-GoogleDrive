package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "notificationMgmts",
    path = "notificationMgmts"
)
public interface NotificationMgmtRepository
    extends PagingAndSortingRepository<NotificationMgmt, Long> {}
