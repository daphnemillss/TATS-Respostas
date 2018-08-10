/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade02.SenhaValidator;
import atividade02.Usuario;
import atividade02.UsuarioDAO;
import atividade02.UsuarioValidator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author daphnemillss
 */
public class UsuarioValTeste {
    
    public UsuarioValTeste() {
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
    public void branchc1(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaa");
        try {
            user.ehUsuarioValido(u);
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "nome do usuario precisa de pelo menos 5 caracteres");
        }
    }
    @Test
    public void branch2(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaaaaa");
        u.setSenha("123");
        u.setSenhaConfirmada("1234");
        try {
            user.ehUsuarioValido(u);
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "senhas diferentes");
        }
        
    }
    @Test
    public void branch3(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaaaaa");
        u.setSenha("123");
        u.setSenhaConfirmada("123");
        when(senha.verificar(anyString())).thenReturn(true);
        try{
            user.ehUsuarioValido(u);
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(),"senha invalida");
        }
    }
    @Test
    public void branch4(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaaaa*");
        u.setSenha("123");
        u.setSenhaConfirmada("123");
        when(senha.verificar(anyString())).thenReturn(false);
        
        try {
            assertFalse(user.ehUsuarioValido(u));
        } catch (Exception ex) {
            Logger.getLogger(UsuarioValTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void branch5(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaaaa*");
        u.setSenha("123");
        u.setSenhaConfirmada("123");
        when(senha.verificar(anyString())).thenReturn(false);
        when(usuario.getByName(anyString())).thenReturn(u);
        
        try {
            user.ehUsuarioValido(u);
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "usuario ja existe");
        }
    }
    @Test
    public void branch6(){
        UsuarioDAO usuario = mock(UsuarioDAO.class);
        SenhaValidator senha = mock(SenhaValidator.class);
        
        UsuarioValidator user = new UsuarioValidator(usuario);
        user.setSenhaValidator(senha);
        
        Usuario u = new Usuario();
        u.setNome("aaaaaa");
        u.setSenha("123");
        u.setSenhaConfirmada("123");
        when(senha.verificar(anyString())).thenReturn(false);
        
        try {
            assertTrue(user.ehUsuarioValido(u));
        } catch (Exception ex) {
            Logger.getLogger(UsuarioValTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
