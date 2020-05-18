package pl.dominik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dominik.model.Speaker;
import pl.dominik.repository.SpeakerRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Constructor with no args");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
        System.out.println("Constructor with set the repository");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @PostConstruct
    private void initialize(){
        System.out.println("We're called after the constructors");
    }
}


