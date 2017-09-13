package net.moopa.cc.common.exception;

import org.springframework.util.StringUtils;

/**
 * Created by Moopa on 12/07/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
public class CcException extends RuntimeException{
    public CcError error;

    public CcException(CcError error){
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"code\":\"");
        sb.append(error.getCode());
        sb.append("\",");

        sb.append("\"msg\":\"");
        sb.append(error.getMessage());
        sb.append("\",");

        if(!StringUtils.isEmpty(error.getSolution())) {
            sb.append("\"solution\":\"");
            sb.append(error.getSolution());
            sb.append("\"");
        }

        return sb.toString();
    }
}
