package atividade04;
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daphnemillss
 */
public class CalculadoraTeste {
    
    public CalculadoraTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void teste1(){
        Funcionario f = new Funcionario();
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(2500f);
        
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        assertEquals(2250f, calc.calculaSalario(f), 0.01);
    }
}
