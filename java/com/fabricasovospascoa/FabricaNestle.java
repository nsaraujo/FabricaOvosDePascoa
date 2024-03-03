/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class FabricaNestle implements IFabricaOvosPascoa {

    @Override
    public Produto cria_ovo_pascoa_pequeno() {
        return new Classic("13 gramas", "13 gramas", "8,4 gramas", "185 gramas", 9.99, 20);
    }

    @Override
    public Produto cria_ovo_pascoa_medio() {
        return new KitKat("24 gramas", "20 gramas", "12 gramas gramas", "227 gramas", 7.99, 30);
    }
    
    @Override
    public Produto cria_ovo_pascoa_grande() {
        return new Alpino("13 gramas", "14 gramas", "8,4 gramas", "337 gramas", 6.90, 10);
    }

    public Produto cria_ovo_pascoa_Bis() {
        return new Bis("4.25 gramas", "14 gramas", "4,5 gramas", "126 gramas", 3.90, 40);
    }

  
}
