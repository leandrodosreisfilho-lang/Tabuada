package br.senai.sp.jandira.tabuada.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class TelaTabuada extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Definir tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");
        stage.setResizable(false);

        //Criar o root componente principal de layout
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #97f183");

        //Criamos a cena e colocamos o root nela
        Scene scene = new Scene(root);

        //Criar o header da tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #226722");

        //colocar o conteudo do header
        Label labeltitulo = new Label("Tabuada");
        labeltitulo.setStyle("-fx-text-fill: white; -fx-font-size: 20; -fx-font-weight: bold;");

        Label labelsubtitulo = new Label("Crie a tabuada que sua imaginação mandar");


        //colocar os labels dentro do header
        header.getChildren().addAll(labeltitulo, labelsubtitulo);

        //criar o grid de formulario
        GridPane gridFormulario = new GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #22675f");

        //criar conteudo label
        Label labelMultiplicando = new Label("Multiplicando");
        TextField textFieldMultiplicando = new TextField();
        Label labelMenorMultiplicador = new Label("Menor Multiplicador");
        TextField textFieldMenorMultiplicador = new TextField();
        Label labelMaiorMultiplicador = new Label("Maior Multiplicador");
        TextField textFieldMaiorMultiplicador = new TextField();

        //colocar os componentes no grid
        gridFormulario.add(labelMultiplicando, 0, 0);



        //criar caixa dos botoes
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #00cdb3");

        //criar botoes
        Button botaoCalcular = new Button("Calcular");
        Button botaoLimpar = new Button("Limpar");
        Button botaoSalvar = new Button("Sair");

        //adicionar botão




        Label labelresultado = new Label("Resultado");
        ListView listaTabuada= new ListView();
        String[] cidades =new String[5];
        cidades[0] = "Itapevi";
        cidades[1] = "Jandira";
        cidades[2] = "Barueri";
        cidades[3] = "Carapicuiba";
        cidades[4] = "Osasco";
        listaTabuada.getItems().addAll(cidades);
        listaTabuada.getItems().add("cotia");


        //


        //criar caixa de resultados
        VBox boxResultado = new VBox();
        boxResultado.setPrefHeight(100);
        boxResultado.setStyle("-fx-background-color: #013a34");

        boxResultado.getChildren().addAll(labelresultado, listaTabuada);

        //adicionar componentes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultado);


        //Colocamnos a cena no palco
        stage.setScene(scene);






        stage.show();

    }
}
