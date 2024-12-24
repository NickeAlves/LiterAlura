package com.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResult {
    private float count;
    private String next = null;
    private String previous = null;
    List<DadosLivro> results = new ArrayList<>();

    public List<DadosLivro> getResults() {
        return results;
    }
}
