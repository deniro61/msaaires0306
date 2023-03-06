package msaaires.domain;

import msaaires.domain.ReservationCreated;
import msaaires.domain.ReservationCancelled;
import msaaires.ReservationmgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Reservation_table")
@Data

public class Reservation  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long reservationId;
    
    
    
    
    
    private Long customerId;
    
    
    
    
    
    private Integer peopleNo;
    
    
    
    
    
    private Integer mileageToIncrease;
    
    
    
    
    
    private Long scheduleId;

    @PostPersist
    public void onPostPersist(){


        ReservationCreated reservationCreated = new ReservationCreated(this);
        reservationCreated.publishAfterCommit();



        ReservationCancelled reservationCancelled = new ReservationCancelled(this);
        reservationCancelled.publishAfterCommit();

        // Get request from Schedule
        //msaaires.external.Schedule schedule =
        //    Application.applicationContext.getBean(msaaires.external.ScheduleService.class)
        //    .getSchedule(/** mapping value needed */);

    }

    public static ReservationRepository repository(){
        ReservationRepository reservationRepository = ReservationmgmtApplication.applicationContext.getBean(ReservationRepository.class);
        return reservationRepository;
    }






}
