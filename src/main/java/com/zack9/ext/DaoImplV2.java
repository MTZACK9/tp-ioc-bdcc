package com.zack9.ext;

import com.zack9.dao.IDao;
import org.springframework.stereotype.Component;

//@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur ");
        return 24;
    }
}
