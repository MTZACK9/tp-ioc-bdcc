package com.zack9.pres;

import com.zack9.dao.IDao;
import com.zack9.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PresIOCDynamic {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class<?> cDao = Class.forName(daoClassName);

        IDao dao =(IDao) cDao.getConstructor().newInstance();

        String metierClassName = sc.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);

        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //Setter
        /*IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        Method setDao = cMetier.getMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);*/


        System.out.println(metier.calcul());
    }
}
