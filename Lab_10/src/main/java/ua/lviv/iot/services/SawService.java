package ua.lviv.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dal.SawRepository;
import ua.lviv.iot.exeptions.IdProvidedWhileCreationException;
import ua.lviv.iot.saws.models.Saw;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class SawService {

    @Autowired
    private SawRepository repository;

    public List<Saw> getSaws() {
        return repository.findAll();
    }

    public Saw getSawById(final Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Saw createSaw(final Saw saw) {
        return repository.save(saw);
    }

    public Saw updateSawById(final Integer id, final Saw saw) {
        if (repository.existsById(id)) {
            saw.setId(id);
            return repository.save(saw);
        }

        throw new NoSuchElementException();
    }

    public Saw deleteSawById(final Integer id) {
        Saw sawToDelete = repository.findById(id).orElseThrow();
        repository.deleteById(id);
        return sawToDelete;
    }
}
