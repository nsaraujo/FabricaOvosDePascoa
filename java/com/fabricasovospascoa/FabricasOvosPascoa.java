/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fabricasovospascoa;

/**
 *
 * @author 55649
 */
public class FabricasOvosPascoa {

    public static void main(String[] args) {

        IFabricaOvosPascoa nestle = new FabricaNestle();

        Produto Alpino = nestle.cria_ovo_pascoa_pequeno();
        Alpino.cod_produto(20);

        Produto Classic = nestle.cria_ovo_pascoa_medio();
        Classic.cod_produto(30);

        Produto KitKat = nestle.cria_ovo_pascoa_grande();
        KitKat.cod_produto(10);
        
        Produto Bis = ((FabricaNestle) nestle).cria_ovo_pascoa_Bis();
        Bis.cod_produto(40);
        
        
        
        IFabricaOvosPascoa lacta = new FabricaLacta();
        
        Produto AoLeite = lacta.cria_ovo_pascoa_pequeno();
        AoLeite.cod_produto(90);

        Produto Oreo = lacta.cria_ovo_pascoa_medio();
        Oreo.cod_produto(100);

        Produto SonhoValsa = lacta.cria_ovo_pascoa_grande();
        SonhoValsa.cod_produto(110);
        
        Produto OuroBranco = ((FabricaLacta) lacta).cria_ovo_pascoa_OuroBranco();
        OuroBranco.cod_produto(120);
        
        

        IFabricaOvosPascoa garoto = new FabricaGaroto();
        Produto BatonAoLeite = garoto.cria_ovo_pascoa_pequeno();
        BatonAoLeite.cod_produto(50);

        Produto Crocante = garoto.cria_ovo_pascoa_medio();
        Crocante.cod_produto(60);

        Produto Talento = garoto.cria_ovo_pascoa_grande();
        Talento.cod_produto(70);
        
        Produto Caribe = ((FabricaGaroto) garoto).cria_ovo_pascoa_Caribe();
        Caribe.cod_produto(80);
        
        
        IFabricaOvosPascoa ferreiro = new Ferreiro();
        Produto FerreiroP = ferreiro.cria_ovo_pascoa_pequeno();
        FerreiroP.cod_produto(160);

        Produto FerreiroM = ferreiro.cria_ovo_pascoa_medio();
        FerreiroM.cod_produto(170);

        Produto FerreiroG = ferreiro.cria_ovo_pascoa_grande();
        FerreiroG.cod_produto(180);
        
        IFabricaOvosPascoa hersheys = new Hersheys();
        Produto HersheysP = hersheys.cria_ovo_pascoa_pequeno();
        HersheysP.cod_produto(130);
        
        Produto HersheysM = hersheys.cria_ovo_pascoa_medio();
        HersheysM.cod_produto(140);

        Produto HersheysG = hersheys.cria_ovo_pascoa_grande();
        HersheysG.cod_produto(150);
        
        

    }
}
