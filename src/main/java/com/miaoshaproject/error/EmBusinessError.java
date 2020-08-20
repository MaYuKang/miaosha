package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {
    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(00001,"参数不合法"),
    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(10001,"用户不存在"),
    //未知的错误
    UNKNOWN_ERROR(200001,"未知错误"),
    USER_LOGIN_FAIL(10002,"用户手机号或密码错误"),
    USER_NOT_LOGIN(10003,"请先登录"),
    STOCK_NOT_ENOUGH(300001,"商品库存不足")
    ;

    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCode,String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
