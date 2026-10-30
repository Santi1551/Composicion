public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos; 

    public Vuelo(){
    }

    public Vuelo(String numero, String origen, String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
    }

  
    public Vuelo(String numero, String origen, String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
   
        asientos = new Asiento[capacidadMaxima];
        for (int i = 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }


   
    public String getNumero(){
        return this.numero;
    }

    public String getOrigen(){
        return this.origen;
    }

    public String getDestino(){
        return this.destino;
    }

    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("---- VUELO " + this.numero + " ----");
        System.out.println("Ruta: " + this.origen + " -> " + this.destino);
        System.out.println("Capacidad: " + this.capacidadMaxima + " asientos");
    }


    public void mostrarAsientos(){
        System.out.println("Estado de asientos - Vuelo " + this.numero + ":");
        for (Asiento a : asientos){
            a.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento){
        for (Asiento a : asientos){
            if (a.getCodigo().equals(codigoAsiento)){
                a.ocupar();
                return;
            }
        }
    }

    public void desembarcar(String codigoAsiento){
        for (Asiento a : asientos){
            if (a.getCodigo().equals(codigoAsiento)){
                a.liberar();
                return;
            }
        }        
    }
}