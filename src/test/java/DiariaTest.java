package org.example;

import example.Diaria;
import example.DiariaArCondicionado;
import example.DiariaBasica;
import example.DiariaComSeguro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DiariaTest {

    @Test
    void deveRetornarvalorDiariaBasica(){
        Diaria diaria  = new DiariaBasica(100.00);
        assertEquals(100.00,diaria.getCusto());
    }
    @Test
    void deveRetornarvalorDiariaBasicacomSeguro(){
        Diaria diaria  =new DiariaComSeguro(new DiariaBasica(100.00));
        assertEquals(120.00,diaria.getCusto());
    }
    @Test
    void deveRetornarvalorDiariaBasicaComArCondicionado(){
        Diaria diaria  =new DiariaArCondicionado(new DiariaBasica(100.00));
        assertEquals(140.00,diaria.getCusto());
    }
    @Test
    void deveRetornarvalorDiariaBasicaComSeguroMaisArCondicionado(){
        Diaria diaria  = new DiariaArCondicionado(new DiariaComSeguro(new DiariaBasica(100.00)));
        assertEquals(160.00,diaria.getCusto());
    }

    @Test
    void deveRetornarDescricao(){
        Diaria diaria  =new DiariaBasica(100.00);
        assertEquals("Diária básica",diaria.getDescricao());

    }
    @Test
    void deveRetornarDescricaoComSeguro(){
        Diaria diaria  = new DiariaComSeguro(new DiariaBasica(100.00));
        assertEquals("Diária básica + Seguro",diaria.getDescricao());

    }
    @Test
    void deveRetornarDescricaoComArCondicionado(){
        Diaria diaria  = new DiariaArCondicionado(new DiariaBasica(100.00));
        assertEquals("Diária básica + Ar-condicionado",diaria.getDescricao());

    }

    @Test
    void deveRetornarDescricaoComSeguroMaisArCondicionado(){
        Diaria diaria  = new DiariaArCondicionado(new DiariaComSeguro(new DiariaBasica(100.00)));
        assertEquals("Diária básica + Seguro + Ar-condicionado",diaria.getDescricao());

    }
}
