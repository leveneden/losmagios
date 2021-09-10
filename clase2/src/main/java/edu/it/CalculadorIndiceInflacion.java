package edu.it;

public class CalculadorIndiceInflacion {
    public Double transformarDePorcentajeAindice(Double porcentaje) {
        return porcentaje / 100d;
    }
    public Double calcularInflacion(Double... porcentuales) {

        double base = 100d;
        double acumulado = base;

        for (var procentual : porcentuales) {
            var indice = transformarDePorcentajeAindice(procentual);
            acumulado = acumulado + (acumulado * indice);
        }

        return acumulado - base;
    }
}
