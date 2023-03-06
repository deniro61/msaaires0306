package msaaires.domain;

import msaaires.domain.*;
import msaaires.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Mileageincreased extends AbstractEvent {

    private Long id;
    private Integer mileage;
    private Long customerId;
}


