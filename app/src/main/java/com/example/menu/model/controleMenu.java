package com.example.menu.model;

public class controleMenu {

    private String id;
    private String configuracao;
    private String conexoes;
    private String somVibracao;
    private String visor;
    private String notificacoes;
    private String teladeBloqueio;
    private String aplicativos;

    public controleMenu(String id, String configuracao, String conexoes, String somVibracao, String visor, String notificacoes, String teladeBloqueio, String aplicativos) {
        this.id = id;
        this.configuracao = configuracao;
        this.conexoes = conexoes;
        this.somVibracao = somVibracao;
        this.visor = visor;
        this.notificacoes = notificacoes;
        this.teladeBloqueio = teladeBloqueio;
        this.aplicativos = aplicativos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public String getConexoes() {
        return conexoes;
    }

    public void setConexoes(String conexoes) {
        this.conexoes = conexoes;
    }

    public String getSomVibracao() {
        return somVibracao;
    }

    public void setSomVibracao(String somVibracao) {
        this.somVibracao = somVibracao;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public String getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(String notificacoes) {
        this.notificacoes = notificacoes;
    }

    public String getTeladeBloqueio() {
        return teladeBloqueio;
    }

    public void setTeladeBloqueio(String teladeBloqueio) {
        this.teladeBloqueio = teladeBloqueio;
    }

    public String getAplicativos() {
        return aplicativos;
    }

    public void setAplicativos(String aplicativos) {
        this.aplicativos = aplicativos;
    }

    @Override
    public String toString() {
        return "controleMenu{" +
                "id='" + id + '\'' +
                ", configuracao='" + configuracao + '\'' +
                ", conexoes='" + conexoes + '\'' +
                ", somVibracao='" + somVibracao + '\'' +
                ", visor='" + visor + '\'' +
                ", notificacoes='" + notificacoes + '\'' +
                ", teladeBloqueio='" + teladeBloqueio + '\'' +
                ", aplicativos='" + aplicativos + '\'' +
                '}';
    }
}
