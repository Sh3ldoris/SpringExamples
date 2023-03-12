package examples.spring.webflux.record.service;

import examples.spring.webflux.record.api.RecordService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecordServiceImpl implements RecordService {

    // Just to mock repository all records saved in 1 litt
    private static final Map<Long, String> RECORDS_MAP;
    // Make sure that list is not empty
    static {
        RECORDS_MAP = new HashMap<>();
        RECORDS_MAP.put(1L, "RecordA");
        RECORDS_MAP.put(2L, "RecordB");
        RECORDS_MAP.put(3L, "RecordC");
        RECORDS_MAP.put(4L, "RecordD");
        RECORDS_MAP.put(5L, "RecordE");
    }

    @Override
    public Mono<String> getById(Long id) {
        return Mono.just(RECORDS_MAP.get(id));
    }

    @Override
    public Flux<String> getAll() {
        return Flux.fromIterable(RECORDS_MAP.values());
    }
}
