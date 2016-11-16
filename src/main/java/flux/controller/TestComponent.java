package flux.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Kenichi on 09/11/2016.
 */
public class TestComponent {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    String valeur;

    public TestComponent(){

    }

    public TestComponent(String valeur){
        this.valeur = valeur;
    }

    public void test(String mot){
        logger.info("["+valeur+"] Vous avez saisi le mot :" + mot);
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
