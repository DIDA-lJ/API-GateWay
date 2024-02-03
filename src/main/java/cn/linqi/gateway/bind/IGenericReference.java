package cn.linqi.gateway.bind;

/**
 * @InterfaceName IGenericReference
 * @Description 统一泛化调用接口
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/03
 */
public interface IGenericReference {
    /**
     * 提供一个标准的 String 的入参和出参类型的泛化调用接口
     * @param args 标准的 String 的入参
     * @return String 出参
     */
    String $invoke(String args);
}
