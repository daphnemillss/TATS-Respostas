/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author daphnemillss
 */
public class CalculadoraDeSalario {

    public double calculaSalario(Funcionario f) {
        switch (f.getCargo()) {
            case "DESENVOLVEDOR":
                if (f.getSalarioBase() >= 3000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.2);
                } 
                else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.1);
                }
            case "DBA":
                if (f.getSalarioBase() >= 2000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.25);
                } 
                else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.15);
                }
        }
        return 0;

        }
}