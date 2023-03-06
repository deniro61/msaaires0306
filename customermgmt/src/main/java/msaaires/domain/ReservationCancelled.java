package msaaires.domain;

import msaaires.domain.*;
import msaaires.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReservationCancelled extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Integer peopleNo;
    private Integer mileageToIncrease;
    private Long scheduleId;
    private Long customerId;
}


