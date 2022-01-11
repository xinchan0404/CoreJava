package com.xinchan.corejava.ch07.aiguigu;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-11
 */
public class XinchanException extends Exception{
    static final long serialVersionUID = -338751694229948L;

    public XinchanException() {

    }

    public XinchanException(String gripe) {
        super(gripe);
    }
}
