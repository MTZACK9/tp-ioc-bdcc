package com.zack9.metier;

import com.zack9.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    //@Qualifier("d2")
    private IDao dao; // Couplage faible

    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 12 * Math.PI * Math.cos(t);
    }



    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDao
     * au moment de l'instantiation
     */
    public MetierImpl(@Qualifier("d") IDao dao) {
        this.dao = dao;
    }

   public MetierImpl() {}

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
