package ua.lviv.iot.saws.services;

import org.springframework.stereotype.Service;
import ua.lviv.iot.saws.models.Saw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class SawService {
    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Saw> sawsMap = new HashMap<Integer, Saw>();

    public List<Saw> getSaws() {
        return sawsMap.values().stream().collect(Collectors.toList());
    }

    public Saw getSawById(final Integer id) {
        return sawsMap.get(id);
    }

    public Saw createSaw(final Saw saw) {
        saw.setId(id.incrementAndGet());
        sawsMap.put(saw.getId(), saw);
        return saw;
    }

    public Saw updateSawById(final Integer id, final Saw saw) {
        saw.setId(id);
        return sawsMap.put(id, saw);
    }

    public Saw deleteSawById(final Integer id) {
        return sawsMap.remove(id);
    }
}
