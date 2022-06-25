import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Cloud
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Cloud extends AllObjects {
    /* construtor */
    public Cloud() {
        // chama a imagem referente a classe
        setImage("nuvem.png");
    }

    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() {
        // método usado para movimentar o objeto horizontalmente(X), sendo da direita
        // para esquerda(-1)
        setLocation(getX() - 1, getY());
        // condicional para remover objeto na posição <=15px
        if (getX() <= 15) {
            ((Florest) getWorld()).removeObject(this);
        }
    }

}
