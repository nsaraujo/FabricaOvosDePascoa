/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class Ferreiro implements IFabricaOvosPascoa{

    @Override
    public Produto cria_ovo_pascoa_pequeno() {
        return new FerreiroRocherP("16 gramas", " 14 gramas", "30 gramas", "137 gramas", 29.99, 160);
    }

    @Override
    public Produto cria_ovo_pascoa_medio() {
        return new FerreiroRocherM("18 gramas", " 16 gramas", "32 gramas", "255 gramas", 39.99, 170);
    }

    @Override
    public Produto cria_ovo_pascoa_grande() {
        return new FerreiroRocherG("22 gramas", " 20 gramas", "35 gramas", "366 gramas", 49.99, 180);
    }
}
