/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import ataque.Ataque;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Pokemon {
    protected String tipo; //fogo, agua, etc
    protected ArrayList<Ataque> ataques = new ArrayList<Ataque>();
    protected int tamanho;
    protected int peso;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spAtk;
    protected int spDef;
    protected int spd;
    
    public void evoluiPokemon(){}
}
