package com.literalura.service;

import com.literalura.dto.LivroDTO;
import com.literalura.model.Autor;
import com.literalura.model.Livro;
import com.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    private List<LivroDTO> converteDados(List<Livro> livros) {
        return livros.stream()
                .map(l -> new LivroDTO(l.getId(),
                        l.getTitle(),
                        l.getAuthors(),
                        l.getLanguages(),
                        l.getDownloadCount()))
                .collect(Collectors.toList());
    }

//    private List<Autor> converteAutores(List<Autor> authors) {
//        return authors == null ? Collections.emptyList() :
//    }
//
//    private List<String> converteIdiomas(List<String> languages) {
//        return languages == null ? Collections.emptyList() : languages.stream()
//                .filter(Objects::nonNull)
//                .map(String::trim)
//                .collect(Collectors.toList());
//    }
}
