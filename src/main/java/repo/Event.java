package repo;

import jakarta.persistence.*;
import java.util.Date;

@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long eventId;

    @Column
    private String eventName;

    @Column
    private String eventStatus;

    @Column
    private Date createdOn;

    @Column
    private Date scheduledTime;
}
