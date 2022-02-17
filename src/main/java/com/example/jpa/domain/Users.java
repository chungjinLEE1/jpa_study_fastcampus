package com.example.jpa.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

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


    public Users(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }
}
