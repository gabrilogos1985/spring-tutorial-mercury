package com.mercurytfs.spring.ioc.beans;

import org.springframework.stereotype.Service;

/**
 * Created by Gabe on 02/09/2016.
 */
@Service
public class Calculo implements Proceso {

    public Object ejecuta() {
        return (int) (Math.random() * 10.0);
    }
}
