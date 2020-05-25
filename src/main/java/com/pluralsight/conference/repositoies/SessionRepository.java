package com.pluralsight.conference.repositoies;

import com.pluralsight.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
