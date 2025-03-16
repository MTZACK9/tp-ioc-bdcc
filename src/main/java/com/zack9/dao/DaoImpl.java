package com.zack9.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{
    @Override
    public double getData()
    {
        System.out.println("Version base de données");
        return 34;
    }
}
