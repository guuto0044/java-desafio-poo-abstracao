public abstract class Bootcamp {
    
    protected static final double XP_PADRAO = 10d; // as classes filhos vão possuir acesso.

    private String titulo;
    private String descricao;
    
    public abstract double calcularxp(); // Metodo ABstrato, deve ser implementado nas classes filhas.

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}
