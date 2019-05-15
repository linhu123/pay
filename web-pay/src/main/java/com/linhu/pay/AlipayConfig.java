package com.linhu.pay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091800542529";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDAC9jYatHLvBsRNrwj6gobU8aSDm3Z7ENm1m/gXbnes+mLx5Jmx8QFj2UVWzJ9xGfV0FoNBMcF2WApHvIv6wrK7WafbaUa5CsnThzJsCzcfq6z/bIrbdcumsDm6Hh65oC4rbebdOMfaSjgzXIJKYk0KmRf/BO2URShIYp5Asz9tkod1Dc9G1jNhfiXSbF4+TXSyy6lAadVAPBmt1AYwOue7HDC/np3DyZAXgmn4df+OnmwGKhWBYh9osFZjzijDhcDvoZhdNIVTHXSKpwbAReJpY3M22gw/d0tNLoLknzKPNqtjQYHTaob7AaCCTWyoA4no+zEn1GmjTZ2Dia//akBAgMBAAECggEBAKbgpIlKKQuUZSDMIyhCEo40efQovaQD/X27EHQyfXTbeTGRNdJB/D+onvmzyWgn5uKQre9qG1cl0L1quqCQ6Uv0hpw6tqFra2Q4KCPKBvGC02RsKwo55CYHK2B62VZSPcA8k7NuGn4M7wyI+XKkuSivPZF6hdaDFh39+0mz+VTsNJRL1WMdFwA8zOl5nNKNqaf/8uxXyaEwNqnvMeEVhoNf0v+hVE3nIW7rg05FoNmDtcr0LJoQUBD58CA2Nf/NLLvlSeUJOwZteWqUcSeXXMnotDonRWFIdqXhOsaT+gjCEl9jWNHsEkPjsvfEEGlwOZVR202QgWPPCOaYgk1f7BECgYEA4Dxpf0y68ZsRc/lQTons01vLbD7Yry8LEdZkbgFKe7F4zNS5gp5Wxm++Lgwws8xevX+vKpzU0u9uXPN1JfAR4GXULfYgzsVQjCoxTcKEMdz3CNWL0ntE15iiE3obuXhb1QVhzFn8k8OnVOb6lGZbmNPmGRj5N7d6+IkY92oaNtsCgYEA20AfYyA2toG3uh6He4N0ej8kUfqC/i+EqOE/0uVsXpbqRTnA5UsVfAlQtkn2cgD28adQTSC4+uK5zwAZ7+6mo0qG5pGvrnExetGuoX25kH3HnJlAu/1Vg3T/iuVVmkh+BVg78m3pHlQkS+x7HE0lSHmKbvWyXof7gqSTnT8voFMCgYBZYjt7bw6l+HZAkIUeiYRJzDGOeI7PZiU3ewqVfxY9sETDAZjhJFTazPg2Ss2vHiw1xYwBpHqBisenbbSo5sV5eZ3WpGH3ilfNR5RXts4TQk2Gy/jscg7DEiipMueSSxPwGjEd0FEKZddx1JDWTub8SJtULcxKFW2DXMMC/NxuOQKBgHb3p1BZRXbokjH6qNc7cDN5GZMmFHgqfphIiSI9fP0idIIVoXaJtGG2iEYxgflATr63Y9pF/DmeVuZcjrZjT6ZhJSvtN1+3afrT1icomk0uAucVPUwEXadUD+llIXrzBPaPdw/H1euwCnXsHq0vqyBVWul0hlHHBZFRDgwQIh6jAoGAC58fOnFjlQszlVo74oL8Bmasah3fMUwnEBLq9b/B2EeDdVCZvKXtRSnVbDH2thEWV7wTAuLNXgh5/YrlL2kRXNKct7K5N0/eS0WN+4BbzcOxMTUiZXKKcEHXplHIbmgetm4dI8mXVCZqVu2sQYZWeV+C4etk4gHkGAvxFG9vhdM=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwAvY2GrRy7wbETa8I+oKG1PGkg5t2exDZtZv4F253rPpi8eSZsfEBY9lFVsyfcRn1dBaDQTHBdlgKR7yL+sKyu1mn22lGuQrJ04cybAs3H6us/2yK23XLprA5uh4euaAuK23m3TjH2ko4M1yCSmJNCpkX/wTtlEUoSGKeQLM/bZKHdQ3PRtYzYX4l0mxePk10ssupQGnVQDwZrdQGMDrnuxwwv56dw8mQF4Jp+HX/jp5sBioVgWIfaLBWY84ow4XA76GYXTSFUx10iqcGwEXiaWNzNtoMP3dLTS6C5J8yjzarY0GB02qG+wGggk1sqAOJ6PsxJ9Rpo02dg4mv/2pAQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

