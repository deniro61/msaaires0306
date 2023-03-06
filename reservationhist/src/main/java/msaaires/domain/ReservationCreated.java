package msaaires.domain;

import msaaires.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Integer peopleNo;
    private Integer mileageToIncrease;
    private Long scheduleId;
    private Long customerId;
}
