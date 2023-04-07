public class Lampada extends DispositivoInteligente {
    private int intensidade;
    
    public Lampada(String dispositivo) {
        super(dispositivo);
        this.intensidade = 50;
    }
    
    public void ligar() {
        setEstado(true);
        System.out.println(getDispositivo() + " ligada.");
    }
    
    public void desligar() {
        setEstado(false);
        System.out.println(getDispositivo() + " desligada.");
    }
    
    public int getIntensidade() {
        return intensidade;
    }
    
    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
        System.out.println("A intensidade da " + getDispositivo() + " agora é " + intensidade + "%.");
    }
}
