package ua.lviv.iot.saws.services;

import org.springframework.stereotype.Service;
import ua.lviv.iot.saws.models.Saw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SawService {
    private Map<Integer, Saw> sawsMap = new HashMap<Integer, Saw>();

    public List<Saw> getSaws(){
        return sawsMap.values().stream().collect(Collectors.toList());
    }

    public Saw getSawById(Integer id) {
        return sawsMap.get(id);
    }
}
