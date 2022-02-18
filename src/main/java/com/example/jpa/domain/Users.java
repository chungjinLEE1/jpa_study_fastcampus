package com.example.jpa.domain;

import com.example.jpa.domain.listener.Auditable;
import com.example.jpa.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name ="users") // Entitiy는 반드시 pk가 필요하다.
@EntityListeners(value = UserEntityListener.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@Table(name="user", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Users extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    @Enumerated
    private Gender gender;

//    @Column(name="CREATEDAT", updatable = false)
////    @CreatedDate
//    private LocalDateTime createdAt;
//    @Column(name="UPDATEDAT", updatable = false)
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;

//    @Transient
//    private String testData;

//
//    @PrePersist
//    public void perPersist(){
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//    @PreUpdate
//    public void PreUpdate(){
//        this.updatedAt = LocalDateTime.now();
//    }
//    @PreRemove
//    public void PreRemove(){
//        System.out.println(">>> PreRemove");
//    }@PostPersist
//    public void PostPersist(){
//        System.out.println(">>> PostPersist");
//    }@PostUpdate
//    public void PostUpdate(){
//        System.out.println(">>> PostUpdate");
//    }@PostRemove
//    public void PostRemove(){
//        System.out.println(">>> PostRemove");
//    }@PostLoad
//    public void PostLoad(){
//        System.out.println(">>> PostLoad");
//    }

}
