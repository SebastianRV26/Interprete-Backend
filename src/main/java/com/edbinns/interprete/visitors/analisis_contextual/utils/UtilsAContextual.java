package com.edbinns.interprete.visitors.analisis_contextual.utils;

import com.edbinns.interprete.visitors.analisis_contextual.AContextualException;
import com.edbinns.interprete.visitors.analisis_contextual.models.ClassNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.FunctionNode;
import com.edbinns.interprete.visitors.analisis_contextual.models.Type;
import com.edbinns.interprete.visitors.analisis_contextual.models.VariableNode;
import org.antlr.v4.runtime.Token;

public class UtilsAContextual {

    public String validateObj(Object obj) {
        if (!(obj instanceof Token)) {
            if (obj instanceof VariableNode) {
                VariableNode lookup = (VariableNode) obj;
                return lookup.getType();
            } else if (obj instanceof FunctionNode) {
                FunctionNode function = (FunctionNode) obj;
                return function.getType();
            } else if (obj instanceof Type) {
                Type type = (Type) obj;
                return type.name();
            } else if (obj instanceof ClassNode) {
                ClassNode classNode = (ClassNode) obj;
                return classNode.getId().getText();
            } else if (obj instanceof String) {
                return  (String) obj;
            }
        } else {
            Token token = (Token) obj;
            switch (token.getType()) {
                case 40:
                case 87:
                    return "INT";
                case 88:
                    return "REAL";
                case 89:
                    return "BOOLEAN";
                case 90:
                    return "STRING";
                case 97:
                    return "CHAR";
                default:
                    throw new AContextualException("Error, tipo de dato no valido");

            }
        }
        return null;
    }

    public String validateOP(String typeObj, String typeObj2, String dataType, String op){
        if((typeObj.equals(dataType)) && (typeObj2.equals(dataType))){
            return dataType;
        }else{
            throw new AContextualException("Los tipos de datos no son compatibles en " + op);
        }
    }

}
