package pl.dominik.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dominik.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
