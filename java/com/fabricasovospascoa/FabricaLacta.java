/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class FabricaLacta implements IFabricaOvosPascoa {

    @Override
    public Produto cria_ovo_pascoa_pequeno() {
        return new ALeite("5 gramas", "5 gramas", "8 gramas", "170 gramas", 8.99, 90);
    }

    @Override
    public Produto cria_ovo_pascoa_medio() {
        return new Oreo("18 gramas", "19 gramas", "22 gramas", "257 gramas", 12.0, 100);
    }

    @Override
    public Produto cria_ovo_pascoa_grande() {
        return new SonhoDeValsa("26 gramas", "25 gramas", "50 gramas", "277 gramas", 2.99, 110);
    }
    
    public Produto cria_ovo_pascoa_OuroBranco(){
        return new OuroBranco("50 gramas", "48 gramas", "65 gramas", "280 gramas", 2.59, 120);
    }    
}
