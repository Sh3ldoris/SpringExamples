package examples.spring.webflux.record.rest;

import examples.spring.webflux.record.api.RecordService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping("/{id}")
    public Mono<String> getRecordById(@PathVariable Long id) {
        return recordService.getById(id);
    }

    @GetMapping
    public Flux<String> getAllRecords() {
        return recordService.getAll();
    }
}
