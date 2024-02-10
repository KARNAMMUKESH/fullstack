package com.birthdayevent.nanthags.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "event_details")
public class EventDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "event_category", nullable = false)
    private String eventname;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String themename;
    @Column(name = "catering_details")
    private String  image;
    @Column(nullable = false)
    private String photographername;
    @Column(nullable = false)
    private String videographername;
    @Column(nullable = false)
    private int photographernumber;
    @Column(nullable = false)
    private int videographernumber;
    @Column(nullable = false)
    private int themecost;


}
