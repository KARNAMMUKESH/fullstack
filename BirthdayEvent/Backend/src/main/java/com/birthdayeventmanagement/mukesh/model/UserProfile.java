package com.birthdayeventmanagement.mukesh.model;


import static jakarta.persistence.GenerationType.UUID;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "user_profile")
public class UserProfile {
    
    @Id
    @GeneratedValue(strategy = UUID)
    private String profileid;
    
    @Column(nullable = false)
    private String fullname;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private long mobileno;

    @Column
    private String profile;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToMany(mappedBy = "participants")
    private Set<UserEvent> event;

}
