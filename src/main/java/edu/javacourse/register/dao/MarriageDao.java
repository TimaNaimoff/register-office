package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageSertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarriageDao extends JpaRepository<MarriageSertificate,Long> {

}
