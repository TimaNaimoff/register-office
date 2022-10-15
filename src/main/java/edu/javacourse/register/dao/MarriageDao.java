package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageSertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MarriageDao extends JpaRepository<MarriageSertificate,Long> {
    List<MarriageSertificate>findByNumber(String number);
    List<MarriageSertificate>findByNumb(@Param("number")String number);
    @Query("SELECT mr FROM MarriageSertificate mr  " +
            "       WHERE mr.number = :number")

    List<MarriageSertificate>findSomething(@Param("number")String number);
}
