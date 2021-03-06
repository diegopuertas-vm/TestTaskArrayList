public class Task {
    
    private int numero;
    private String descripcion;
    private boolean finalizada;
    private String vencimiento;
   
    public Task() {
        this.numero = -1;
        this.descripcion = null;
        this.finalizada = false;
        this.vencimiento = null;
    }

    public Task(int numero) {
        this.numero = numero;
        this.descripcion = "";
        this.finalizada = false;
        this.vencimiento = "";
    }

    public int getNumero() {
        return numero;  
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;  
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getFinalizada() {
        return finalizada;  
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public String getVencimiento() {
        return vencimiento;  
    }
    
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
}
