package com.literalura.service;

import com.literalura.dto.LivroDTO;
import com.literalura.model.Livro;
import com.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;
    private final ConverteDados converteDados;

    @Autowired
    public LivroService(LivroRepository livroRepository, ConverteDados converteDados) {
        this.livroRepository = livroRepository;
        this.converteDados = converteDados;
    }

    public List<LivroDTO> obterLivros(String json) {
        List<Livro> livros = converteDados.obterLivros(json);
        return converteDados.converteDados(livros);
    }

    public void salvarLivros(String json) {
        List<Livro> livros = converteDados.obterLivros(json);
        livroRepository.saveAll(livros);
    }
}
