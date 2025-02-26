


class Calculadora {
    public double calcularAreaTotal(Figura[] figuras) {
        double areaTotal = 0;
        
        for (Figura figura : figuras) {
            if(figura.getTipo().equals("Rectangulo")){
                areaTotal += ((Rectangulo)figura).calcularArea();
            }else if(figura.getTipo().equals("Circulo")){
                areaTotal += ((Circulo) figura).calcularArea();
            }
            
        }
        return areaTotal;
    }
}