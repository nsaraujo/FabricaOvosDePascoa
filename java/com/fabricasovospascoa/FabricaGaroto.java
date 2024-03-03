/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class FabricaGaroto implements IFabricaOvosPascoa {

    @Override
    public Produto cria_ovo_pascoa_pequeno() {
        return new BatonAoLeite("8,3 gramas", "8,3 gramas", "5,2 gramas", "172 gramas", 1.99, 50);
    }

    @Override
    public Produto cria_ovo_pascoa_medio() {
        return new Crocante("22 gramas", " 20 gramas", "0,8 gramas", "215 gramas", 2.00, 60);
    }

    @Override
    public Produto cria_ovo_pascoa_grande() {
        return new Talento("34 gramas", " 30 gramas", "28 gramas", "350 gramas", 59.95, 70);
    }
    
    public Produto cria_ovo_pascoa_Caribe(){
        return new Caribe("14 gramas", " 12 gramas", "18 gramas", "150 gramas", 19.99, 80);
    }
}
