public class ArCondicionado extends DispositivoInteligente {
    private int temperatura;
    
    public ArCondicionado(String dispositivo) {
        super(dispositivo);
        this.temperatura = 25;
    }
    
    public void ligarAr() {
        setEstado(true);
        System.out.println(getDispositivo() + " ligado.");
    }
    
    public void desligarAr() {
        setEstado(false);
        System.out.println(getDispositivo() + " desligado.");
    }
    
    public int getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        System.out.println("A temperatura do " + getDispositivo() + " agora é " + temperatura + " graus Celsius.");
    }
}
