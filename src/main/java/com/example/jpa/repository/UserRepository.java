package com.example.jpa.repository;

import com.example.jpa.domain.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepositoryImplementation<Users, Long> {

//    List<Users> findByName(String name);
    Optional<Users> findByName(String name);


    Set<Users> findByNameIs(String name);
    Set<Users> findUsersByName(String name);
    Set<Users> findUsersByNameEquals(String name);


    Set<Users> findById(String name);

    Users findByEmail(String name);

    Users getByEmail(String email);

    Users readByEmail(String email);

    Users queryByEmail(String email);

    Users searchByEmail(String name);

    Users streamByEmail(String email);

    Users findUserByEmail(String email);

    Users findSomethingByEmail(String email);


    List<Users> findFirstByName(String name);

    List<Users> findTop1ByName(String name);

    List<Users> findLast1ByName(String name);

//
    List<Users> findByEmailAndName(String email, String name);

    List<Users> findByEmailOrName(String email, String name);
    List<Users> findByCreatedAtAfter(LocalDateTime yestearday);


    List<Users> findByCreatedAtGreaterThanAnd(LocalDateTime yesterday);

    List<Users> findByCreatedAtGreaterThanEquals(LocalDateTime yesterday);

    List<Users> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);
    List<Users> findByIdBetween(Long id1, Long id2);

    List<Users> findByIdGreaterThanEqualsAndIdLessThanEquals(Long id1, Long id2);

    List<Users> findByIdIsNotNull();

    List<Users> findByAddressIsNotEmpty(); // name is not null and name != '' ??

    List<Users> findByNameIn(List<String> names);

    List<Users> findByNameStartingWith(String name);
    List<Users> findByNameEndingWith(String name);
    List<Users> findByNameContains(String name);

    List<Users> findByNameLike(String name);


    //
    List<Users> findTop1ByName2(String name);
    List<Users> findTop1ByNameOrderByIdDesc(String name);
    List<Users> findFirstByNameOrderByInDesc(String name);
    List<Users> findFirstByNameOrderByInDescEmailAsc(String name);

    List<Users> findFirstByName(String name, Sort sort);

    Page<Users> findByName(String name, Pageable pageable);

    @Query(value = "select * from users limit 1;", nativeQuery = true)
    Map<String, Object> findRawRecord();
}
