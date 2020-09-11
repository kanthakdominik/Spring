package pl.dominik.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dominik.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
