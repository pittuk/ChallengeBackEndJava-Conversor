/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.challengeoneconversor;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.challengeoneconversor.igu.Pantalla;

/**
 *
 * @author pittu
 */
public class ChallengeOneConversor {

    public static void main(String[] args) {
        
        //lanzamos la pantalla
        //indicamos el tema que vamos a utilizar
        FlatMaterialLighterIJTheme.setup();
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
