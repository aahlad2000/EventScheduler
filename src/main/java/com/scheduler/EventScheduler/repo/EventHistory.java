package com.scheduler.EventScheduler.repo;

import jakarta.persistence.*;

import java.util.Date;

@Table
public class EventHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long recordId;

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

    @Column
    private Date recordedOn;

    @Column
    private String message;
}
