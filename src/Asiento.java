public class Asiento {

    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo){
        this.codigo = codigo;
        this.ocupado = false;
    }

   
    public String getCodigo(){
        return this.codigo;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

 
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    
    public void ocupar(){
        if (ocupado){
            System.out.println("El asiento " + this.codigo + " ya está ocupado");
        }else {
            ocupado = true;
            System.out.println("Asiento " + this.codigo + " ocupado");
        }
    }

    public void liberar(){
        this.ocupado = false;
        System.out.println("Asiento " + this.codigo + " liberado");
    }

    public void mostrarEstado(){
        System.out.println("Asiento " + this.codigo + ": " + (ocupado ? "ocupado" : "libre"));
    }
}