package examples.spring.webflux.record.api;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.lang.NonNull;

public interface RecordService {

    /**
     * Gets Record in String format.
     * Searches by ID.
     */
    Mono<String> getById(@NonNull Long id);

    /**
     * Gets all records saved.
     */
    Flux<String> getAll();
}
