package com.itstep.patukhov;

/**
 * Created by lotrik on 12.07.15.
 */
public class MyException extends Exception{

    public MyException () {

    }

    public MyException (String message, Throwable exception) {
        super(message,exception);
    }

    public MyException (String message) {
        super(message);
    }

    public MyException (Throwable exception) {
        super(exception);
    }
}
