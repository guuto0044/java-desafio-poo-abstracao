public class Cursos extends Bootcamp {
    
    private int cargaHoraria;
    
    public Cursos() {

    }
    
    @Override
    public double calcularxp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    

    
    

    

}
