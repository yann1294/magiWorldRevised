package com.opc.magiworld.Model;

import java.util.Scanner;

public class Game {

    Personnage player1;
    Personnage player2;

    private Scanner sc = new Scanner(System.in);

    /**
     * run the game and handle the creation of characters.
     */
    public void run(){
        System.out.println("Création du personnage du Joueur 1");
        player1 = createPersonnage("Joueur 1");
        System.out.println(player1);
        System.out.println("Création du personnage du Joueur 2");
        player2 = createPersonnage("Joueur 2");
        System.out.println(player2);
        while (player1.getLife() > 0 && player2.getLife() > 0){
            playerTurn(player1,player2);
            if (player2.getLife() > 0)
                playerTurn(player2, player1);
        }
        if (player1.getLife() <= 0)
            System.out.println(player1.getName() + " a perdu");
        if (player2.getLife() <= 0)
            System.out.println(player2.getName() + " a perdu");
    }
}
