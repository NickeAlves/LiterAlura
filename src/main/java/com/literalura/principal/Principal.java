package com.literalura.principal;

import com.literalura.model.DadosLivro;
import com.literalura.model.Livro;
//import com.literalura.repository.LivroRepository;
import com.literalura.repository.LivroRepository;
import com.literalura.service.ConsumoApi;
import com.literalura.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in);
    List<Livro> livroList = new ArrayList<>();
    ConsumoApi consumoApi = new ConsumoApi();
    ConverteDados converteDados = new ConverteDados();
    Optional<Livro> livroBusca;
    LivroRepository repository;

    private final String URL_BASE = "https://gutendex.com/books/?search=";

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                    
                    0 - Sair
                    
                    """;
            System.out.println(menu);
            System.out.print("Escolha a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroPeloTitulo();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorAno();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Selecione uma opção válida.");
            }
        }

    }

    private DadosLivro buscarLivroPeloTitulo() {
        System.out.print("Qual o título do livro? ");
        var tituloLivro = sc.nextLine();
        var json = consumoApi.obterDados(URL_BASE + tituloLivro.replace(" " ,
                "%20"));
        DadosLivro dados = converteDados.obterDados(json, DadosLivro.class);
        System.out.println(json + "\n"+dados);
        return dados;
    }

    private void listarLivrosRegistrados() {
    }

    private void listarAutoresRegistrados() {
    }

    private void listarAutoresVivosPorAno() {
    }

    private void listarLivrosPorIdioma() {
    }
}
