package com.birthdayeventmanagement.mukesh.model;

import static jakarta.persistence.GenerationType.UUID;
import java.util.Set;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event_details")
public class UserEvent {
    @Id
    @GeneratedValue(strategy = UUID)
    private String eventid;

    @Column
    private String eventname;

    @Column
    private String eventdestination;

    @Column
    private String price;

    @Column
    private Long maxparticipants;

    @ManyToMany
    @JoinTable(name = "event_user_profile",
               joinColumns = @JoinColumn(name = "event_id"),
               inverseJoinColumns = @JoinColumn(name = "profileid"))
    private Set<UserProfile> participants;

}
