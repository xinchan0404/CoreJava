package com.xinchan.corejava.ch07.aiguigu.homework;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-11
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -338751694229948L;

    public EcDef() {

    }

    public EcDef(String gripe) {
        super(gripe);
    }
}
