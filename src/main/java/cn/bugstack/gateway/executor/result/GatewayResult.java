package cn.bugstack.gateway.executor.result;

/**
 * @author linqi
 * @version 1.0.0
 * @description 网关结果返回
 */

public class GatewayResult {

    private String code;
    private String info;
    private Object data;

    protected GatewayResult(String code, String info, Object data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public static GatewayResult buildSuccess(Object data){
        return new GatewayResult("0000","调用成功", data);
    }

    public static GatewayResult buildError(Object data){
        return new GatewayResult("0001","调用失败", data);
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public Object getData() {
        return data;
    }

}