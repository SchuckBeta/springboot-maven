package cn.zhangxd.trip.client.mobile.constant;

/**
 * 返回 code 常量
 * Created by zhangxd on 16/5/9.
 */
public class ReturnCode {

    /**
     * 成功
     */
    public static final String SUCCESS = "0";

    /****************************************************/

    /**
     * 400 (错误请求) 服务器不理解请求的语法。
     */
    public static final String BAD_REQUEST = "10001";
    /**
     * 404 (未找到) 服务器找不到请求的资源。
     */
    public static final String NOT_FOUND = "10002";
    /**
     * 405 (方法禁用) 禁用请求中指定的方法。
     */
    public static final String METHOD_NOT_ALLOWED = "10003";
    /**
     * 406 (不接受) 无法使用请求的内容特性响应请求的网页。
     */
    public static final String NOT_ACCEPTABLE = "10004";
    /**
     * 415 (不支持的媒体类型) 请求的格式不受请求页面的支持。
     */
    public static final String UNSUPPORTED_MEDIA_TYPE = "10005";
    /**
     * 500 (服务器内部错误) 服务器遇到错误，无法完成请求。
     */
    public static final String INTERNAL_SERVER_ERROR = "10006";
    /**
     * 401 (未授权) 请求要求身份验证。 (Basic 认证错误或无权限头)
     */
    public static final String UNAUTHORIZED = "10007";
    /**
     * 403 (禁止) 服务器拒绝请求。
     */
    public static final String FORBIDDEN = "10008";


    /****************************************************/

    /**
     * 401 Token 无效
     */
    public static final String INVALID_TOKEN = "20001";

    /****************************************************/

    /**
     * 400 无效 Grant Type (用户名,密码错误或未传 | refresh_token 错误或未传)
     */
    public static final String INVALID_GRANT = "30001";
    /**
     * 400 无效 Scope
     */
    public static final String INVALID_SCOPE = "30002";
    /**
     * 400 不支持的 Grant Type
     */
    public static final String UNSUPPORTED_GRANT_TYPE = "30003";

}
