package com.pluralsight.conference.repositoies;

import com.pluralsight.conference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
