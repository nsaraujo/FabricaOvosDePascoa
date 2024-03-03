/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class Hersheys implements IFabricaOvosPascoa{

    @Override
    public Produto cria_ovo_pascoa_pequeno() {
        return new HersheysP("14 gramas", " 12 gramas", "28 gramas", "137 gramas", 19.99, 130);
    }

    @Override
    public Produto cria_ovo_pascoa_medio() {
        return new HersheysM("16 gramas", " 14 gramas", "38 gramas", "225 gramas", 29.99, 140);
    }

    @Override
    public Produto cria_ovo_pascoa_grande() {
        return new HersheysG("18 gramas", " 16 gramas", "48 gramas", "336 gramas", 39.99, 150);
    }

}
