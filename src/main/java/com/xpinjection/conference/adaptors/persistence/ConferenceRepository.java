package com.xpinjection.conference.adaptors.persistence;

import com.xpinjection.conference.domain.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
