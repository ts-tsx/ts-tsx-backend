package ru.tstsx.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tstsx.backend.model.LanguageDto;
import ru.tstsx.backend.repository.LanguageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageService {
    private final LanguageRepository languageRepository;

    public List<LanguageDto> getAllLanguagesFromDb() {
        return languageRepository.findAll();
    }

    public LanguageDto getLanguageFromDbById(Long id) {
        return languageRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
