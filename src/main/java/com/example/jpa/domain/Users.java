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
public class Users {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    @Column(name="CREATEDAT")
    private LocalDateTime createdAt;
    @Column(name="UPDATEDAT")
    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;

    
    

    public Users(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }

    public Users(Object o, String podong, String s, LocalDateTime now, LocalDateTime now1) {
    }
}
