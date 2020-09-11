package pl.dominik.service;

import pl.dominik.model.Speaker;
import pl.dominik.repository.HibernateSpeakerRepositoryImpl;
import pl.dominik.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
