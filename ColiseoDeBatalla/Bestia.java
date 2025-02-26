public class Bestia {
    private String nombre;
    private String tipo;
    private int energia;
    private int dañoBasico;
    private int dañoUlti;
    private int nuevaEnergia = 50;
    private int contadorUlti;
    private boolean esActivada;

    public Bestia(String nombre, String tipo) {
        this.nombre = nombre;
        setTipo(tipo);
        this.energia = 100;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
        switch (this.tipo) {
            case "fuego":
                dañoBasico = 35;
                dañoUlti = 65;
                energia = 80;
                break;
            case "viento":
            case "agua":
                dañoBasico = 27;
                dañoUlti = 50;
                energia = 100;
                break;
            case "tierra":
                dañoBasico = 25;
                dañoUlti = 40;
                energia = 120;
                break;
            default:
                System.out.print("Tipo de bestia inválido.");
        }
    }

    public void descansar() {
        if (energia == 100) {
            System.out.println("La energía está al máximo, no puedes recuperar más.");
        } else {
            energia = Math.min(100, energia + nuevaEnergia);
        }
    }

    public void usarBasico(Gladiador gladiador) {
        contadorUlti++;
        gladiador.setVida(gladiador.getVida() - dañoBasico);
        
         if(contadorUlti == 3){
               esActivada = true;
            System.out.println("¡Habilidad especial activada!");
        }
    }

      public void usarUlti(Gladiador gladiador) {
        if (esActivada) {
            gladiador.setVida(gladiador.getVida() - dañoUlti);
            System.out.println("Habilidad especial utilizada");
            esActivada = false; 
            contadorUlti = 0; 
        } else {
            System.out.println("La habilidad especial no está activada.");
        }
    }
}
