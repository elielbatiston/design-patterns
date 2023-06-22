package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {

    public String nome;

    public List<File> files = new ArrayList<>();

    public Directory(String nome) {
        this.nome = nome;
    }

    public void add(File file) {
        this.files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Nome do diretório: " + this.nome);
        System.out.println("Nro de arquivos: " + this.files.size());
        for (int cont = 0; cont < this.files.size(); cont++) {
            this.files.get(cont).ls();
        }
    }
}
