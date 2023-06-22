package com.designpatterns.composite;

public class FileImpl implements File {

    public String nome;

    public FileImpl(String nome) {
        this.nome = nome;
    }

    @Override
    public void ls() {
        System.out.println("Nome do arquivo: " + this.nome);
    }
}
