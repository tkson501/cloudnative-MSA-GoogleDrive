package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotificationMgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<NotificationMgmt>> {

    @Override
    public EntityModel<NotificationMgmt> process(
        EntityModel<NotificationMgmt> model
    ) {
        return model;
    }
}
