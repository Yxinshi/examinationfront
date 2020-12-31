package com.bgs.examinationfront.pojo;

public class JsonResult extends Result{

    private static final long serialVersionUID = 1665769081233082687L;

    public JsonResult(String code, String message, Object data) {
        super(code, message, data);
    }

    public JsonResult(String code, String message) {
        super(code, message);
    }

    public JsonResult() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
