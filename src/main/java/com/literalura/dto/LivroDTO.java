package com.literalura.dto;

import java.util.List;

public record LivroDTO(Long id,
                       String title,
                       List<String> authors,
                       List<String> languages,
                       Integer downloadCount) {
}
