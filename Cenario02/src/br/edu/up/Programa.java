package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

        Ponto ponto3 = new Ponto(7, 2);
        
        double distanciaPonto2Ponto3 = ponto2.calcularDistancia(ponto3);
        System.out.println("Distância entre ponto2 e ponto3: " + distanciaPonto2Ponto3);

        ponto1.setX(10);
        ponto1.setY(3);

       

    }
}