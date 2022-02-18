package com.example.jpa.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity(name ="users") // Entitiy는 반드시 pk가 필요하다.
@Table(name="user", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Users {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    @Enumerated
    private Gender gender;

    @Column(name="CREATEDAT", updatable = false)
    private LocalDateTime createdAt;
    @Column(name="UPDATEDAT", updatable = false)
    private LocalDateTime updatedAt;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;

//    @Transient
//    private String testData;

    
    

    public Users(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }

    public Users(Object o, String podong, String s, LocalDateTime now, LocalDateTime now1) {
    }
}
