package com.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("id") Long id,
                         @JsonAlias("title") String title,
                         @JsonAlias("languages") List<String> languages,
                         @JsonAlias("authors") List<Autor> authors,
                         @JsonAlias("download_count") Integer downloadCount) {
}
