package DSA_practice;
import java.util.*;
//inheritance
class pokemon{
    int power;
    String type;
    pokemon(String type, int power){}
       pokemon(){}
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class strongpokemon extends pokemon{
    int speed;
}
 class  Legendarypokemon extends pokemon {
    String ability;
 }
 class Godpokemon extends  Legendarypokemon{
    char tag;
 }
public class prac11 {
    public static void main(String[] args) {
        Legendarypokemon mewtow=new Legendarypokemon();
        mewtow.ability = "pressure";
        pokemon pikachu = new pokemon();
        Godpokemon dialga= new Godpokemon();
        dialga.tag= 'A';

    }
}
