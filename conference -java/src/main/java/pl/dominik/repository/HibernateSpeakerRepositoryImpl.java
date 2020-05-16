package pl.dominik.repository;

import org.springframework.stereotype.Repository;
import pl.dominik.model.Speaker;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Dominik");
        speaker.setLastName("Kan");

        speakers.add(speaker);
        return speakers;
    }
}
