package com.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livros")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Livro {
    @Id
    private Long id;
    private String title;
    @ElementCollection
    private List<String> languages;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Autor> authors;
    private Integer downloadCount;

    public Livro() {
    }

    public Livro(Long id, String title, List<String> languages, List<Autor> authors, Integer downloadCount) {
        this.id = id;
        this.title = title;
        this.languages = languages;
        this.authors = authors;
        this.downloadCount = downloadCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<Autor> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Autor> authors) {
        this.authors = authors;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    @Override
    public String toString() {
        return "--------\tLivro\t----------\n" +
                "Título: " + title +
                "\nAutor: " + getAuthors() +
                "\nIdioma: " + getLanguages() +
                "\nNúmero de downloads: " + downloadCount +
                "\n----------------------------\n";
    }
}
