package pl.dominik.repository;

import pl.dominik.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
