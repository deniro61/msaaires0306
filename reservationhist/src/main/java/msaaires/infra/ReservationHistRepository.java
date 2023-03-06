package msaaires.infra;

import msaaires.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="reservationHists", path="reservationHists")
public interface ReservationHistRepository extends PagingAndSortingRepository<ReservationHist, Long> {

    

    
}
