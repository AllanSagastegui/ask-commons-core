package pe.ask.commons.core.domain.utils;

import pe.ask.commons.core.domain.model.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class PaginationUtils {
    public <T> Mono<Pageable<T>> createPageable(Flux<T> contentFlux, Mono<Long> countMono, int page, int size) {
        return contentFlux.collectList()
                .zipWith(countMono)
                .map(tuple -> buildPageable(tuple.getT1(), tuple.getT2(), page, size));
    }

    public <T> Mono<Pageable<T>> createPageable(Mono<List<T>> contentMono, Mono<Long> countMono, int page, int size) {
        return contentMono
                .zipWith(countMono)
                .map(tuple -> buildPageable(tuple.getT1(), tuple.getT2(), page, size));
    }

    private <T> Pageable<T> buildPageable(List<T> content, Long totalElements, int page, int size) {
        var totalPages = (int) Math.ceil((double) totalElements / size);

        return Pageable.<T>builder()
                .content(content)
                .totalElements(totalElements)
                .totalPages(totalPages)
                .page(page)
                .size(size)
                .build();
    }
}
