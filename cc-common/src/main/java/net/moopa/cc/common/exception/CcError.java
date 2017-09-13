package net.moopa.cc.common.exception;

/**
 * Created by Moopa on 12/07/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
public enum CcError {
    LoginError("000001","login error",""),

    RequestParamError("100001","request param error","");

    CcError(String code, String msg, String solution){
        this.code = code;
        this.message = msg;
        this.solution = solution;
    }

    private String code;
    private String message;
    private String solution;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getSolution() {
        return solution;
    }

}
