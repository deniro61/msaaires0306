package msaaires.domain;

import msaaires.domain.*;
import msaaires.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class MileageDecreased extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Integer mileage;
}


