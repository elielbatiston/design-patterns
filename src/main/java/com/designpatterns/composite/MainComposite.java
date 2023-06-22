package com.designpatterns.composite;

public class MainComposite {

    public static void main(String[] args) {
        Directory pastaDeCursos = new Directory("Cursos");
        File cursoPHP = new FileImpl("CursodePHP.zip");
        File cursoJava = new FileImpl("CursodeJava.zip");
        File cursoCSharp = new FileImpl("CursodeC#.zip");

        pastaDeCursos.add(cursoPHP);
        pastaDeCursos.add(cursoJava);
        pastaDeCursos.add(cursoCSharp);

        Directory diretoAoPonto = new Directory("Direto ao ponto");
        File DPJavaScript = new FileImpl("DPJavaScript.mp4");
        File DPAndroid = new FileImpl("DPAndroid.mp4");

        diretoAoPonto.add(DPJavaScript);
        diretoAoPonto.add(DPAndroid);

        pastaDeCursos.add(diretoAoPonto);

        pastaDeCursos.ls();
    }
}
