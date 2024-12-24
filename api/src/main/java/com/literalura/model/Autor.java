package com.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @JsonAlias("birth_year")
    private Integer birthYear;
    @JsonAlias("death_year")
    private Integer deathYear;

    @ManyToMany(mappedBy = "authors")
    List<Livro> livroList;

    public Autor() {
    }

    public Autor(Long id, String name, Integer birthYear, Integer deathYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    @Override
    public String toString() {
        return "Autor: " + name +
                "\nAno nascimento: " + birthYear +
                "\nAno falescimento: " + deathYear +
                "Livros: " + livroList;
    }
}
