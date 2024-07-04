import java.time.LocalDate;

public class Mentorias extends Bootcamp {
    
    private LocalDate data;
    
    public Mentorias() {

    }

    @Override
    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return 
                getTitulo() + " - " + getDescricao() + " - " + getData();
    }





    
    



}
