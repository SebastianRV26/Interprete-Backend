package com.edbinns.InterpreteBackend.visitors.interprete.utils;

import com.edbinns.InterpreteBackend.visitors.analisis_contextual.utils.AContextualException;

public class InterpreterUtils {

    public void divisionBy0(int value){
        if(value == 0)
            throw new  AContextualException("No se permite la divición por 0 ");
    }
    public void divisionBy0(double value){
        if(value == 0)
            throw new  AContextualException("No se permite la divición por 0 ");
    }

}
