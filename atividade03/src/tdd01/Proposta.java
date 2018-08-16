package tdd01;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daphnemillss
 */
class Proposta {
    private float total;
    private int numeroParcelas;
    private float valorParcela;
    
    Proposta (float ptotal, int pnumeroParcelas){
        this.total = ptotal;
        this.numeroParcelas = pnumeroParcelas;
    }

    Proposta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    /**
     * @return the valorParcela
     */
    public float getValorParcela() {
        return total/numeroParcelas;
    }

    /**
     * @param valorParcela the valorParcela to set
     */


}
