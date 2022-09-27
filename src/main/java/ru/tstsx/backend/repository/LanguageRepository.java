package ru.tstsx.backend.repository;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import ru.tstsx.backend.model.LanguageDto;

import java.util.List;
import java.util.Optional;

public interface LanguageRepository extends CrudRepository<LanguageDto, Long> {
    @Override
    List<LanguageDto> findAll();

    Optional<LanguageDto> findById(Long id);
}
