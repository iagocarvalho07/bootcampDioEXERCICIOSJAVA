package com.aulaMetodos;

public class mensagem {
    public static void obeterMensagem(int hora) {

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemDoDia();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemdatarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemDaNoite();
                break;
        }
    }
    public static void mensagemDoDia(){
        System.out.println("bom dia");
    }
    public static void mensagemdatarde(){
        System.out.println("boa tarde");
    }
    public static void mensagemDaNoite(){
        System.out.println("boa noite");
    }
}
