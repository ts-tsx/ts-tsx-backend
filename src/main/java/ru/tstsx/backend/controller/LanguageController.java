package ru.tstsx.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tstsx.backend.model.LanguageDto;
import ru.tstsx.backend.service.LanguageService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/language")
@RequiredArgsConstructor
public class LanguageController {
    private final LanguageService service;

    @GetMapping("/get-all")
    public List<LanguageDto> getAll() {
        return service.getAllLanguagesFromDb();
    }

    @GetMapping("/{id}")
    public LanguageDto getById(@PathVariable Long id) {
        return service.getLanguageFromDbById(id);
    }
}
