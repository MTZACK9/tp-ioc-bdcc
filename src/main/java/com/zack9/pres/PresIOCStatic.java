package com.zack9.pres;

import com.zack9.dao.DaoImpl;
import com.zack9.metier.MetierImpl;

public class PresIOCStatic {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl mi = new MetierImpl(dao);
        System.out.println(mi.calcul());
    }
}
