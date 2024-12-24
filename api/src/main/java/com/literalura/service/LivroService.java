package com.literalura.service;

import com.literalura.dto.LivroDTO;
import com.literalura.model.Livro;
import com.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public LivroService(LivroRepository livroRepository) {
        this.repository = livroRepository;
    }

    private List<LivroDTO> converteDados(List<Livro> livros) {
        return livros.stream()
                .map(l -> new LivroDTO(l.getId(),
                        l.getTitle(),
                        l.getAuthors(),
                        l.getLanguages(),
                        l.getDownloadCount(),
                        l.getCover()))
                .collect(Collectors.toList());
    }

    public Livro salvarLivro(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listarLivros() {
        return repository.findAll();
    }
}
