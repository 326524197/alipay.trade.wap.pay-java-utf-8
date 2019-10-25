package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101200666698";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCx2GmcRuwCyJq+NWdymIQmfp4yRKShD6KhMLfrRUsyQq8kvU9MkQRNXYOVon/Vc4L9rRDPWpQwMmhdeQ4uW2rV6sAQQvxbdO6Ab5QB48dg+kUm9sJ9tmPlIJmFOuGkyEnv03jWcZnA+SBJHLZLLr6bfSxKwqsL4s7su1nqf2DyaLlOjJtVOzr4ktLZU1iRJ2OSHrWyjZGQURdEkV2SIVwc6eLdzZtVqcxfbUgixwFl8EEnzMueT8NtZVxxbHSHIguZAzOJ1KGWvAXKh+kwQ1wQOrjRyeB3zMXRuW5FlLatgjeOJfEijb6CbTIRlxqIfWLiwewJcD+uvdcl8sWpFGjAgMBAAECggEBAMEBKHXxJmpu3g/5ulK8tCeXLGZ7d/fPKtm/bAqQS6cxH350cKXPJTuYKf9TKTLmJ2Ibd8wZEzwpjKJ9W0QKGe3q1PtPeTImjeKGz7olg17P0yoktgtNm492rS/SEwAq0nO8UMWzs7FoXgjJwTQJ6s00H39fExhDlEf3qN9LxnXKn5nXzrsbNEUHN3RMtDLOs+kcCJmYWGUsdqpNUGjT1WJvnkWqK4rcpIJAO1LuYK6J/iAC9PtsYRubVTSJcEnI6KTZnx+/eJHd2vEQTp9izlV8uh//92RcWWb5tJMuM267EZwOA21YQgRuZvaGPKaX7MMes0lyXvJd6j9zKeeGOaECgYEA8qSIzqxFf1VYmN+WbxCXgPq3gFp27wMQUW/+wzhCER/Fp9OUZ9PkjeQpaKiZZfI50unwm0tUjuTU/ohlx+5Wfj7smO2Kk46wDW4jPS3cxYEuQyxEkf5B2kT9RMK+d7LP+ytfCduitzqWsTub389LNMk+hQ0Fv3IFonRddPzQ+1UCgYEAzYBSHV5HhMxXeQKh2QHMPlZahf9/uL3dsUFr5U6Em85ZknQ41azjLTC8/qOVnAnVDsjCyek5fAuP5j4yv+rVRvvV+/weMAF/WHxrybGHXeXqRhb/+AinVlEh1MILUlx9/xm9eQz7z6zXRZFwZjHVtvyAjWQDapiH/r5DOXBoyRcCgYEAlF2JDZ6G7EI6Z1en+4eQrBwh4kjuml0sOC+b/rDCrQfZazJTd104To6px0X4bj67nrzPE5XvQWSo3G54ldSlbJJ7R1NQPcOs4LlssLb/XIEN0aMa1o46pAU1PDs8DaL3y2QMu9Fh4Fnh1MNXH3X4TXGUWfTJg/NrgJdYofUIr/UCgYAg5wO+ugKfa4wxzs8VDKmj7XWO8MqFTLj7EWtyCnFG9PH4de1HoOe6q4wHBTAGDLj1JgWyCEpw5vUCO0Eq4zGErPuk3cgDjanTBBDJ+UegLBinYjVXhCMuucy94NepNy/hMUDZ6c9Df/vzooaphh8erizy9mlpnsRfcB0ZTDsqvwKBgEV4SfO4EKdxLpMHVSJDbnXYhpxhVAEQha8Kj9UbA2jrB0d5SBwfyOxfVubCTpRxbmKGi6vcEreGamJpUXZcwd+spkM7P9xtx/rSFRZoUMZdYJLnLZ7qHE4HmX+CMnIclprmkYqiYxoVIBUV9MezznZ/RThN6hxJMUF7+Bkaizr0";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//	public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	public static String notify_url = "";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
//	public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	public static String return_url = "";
	// 请求网关地址
//	public static String URL = "https://openapi.alipay.com/gateway.do";
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
//	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwsdhpnEbsAsiavjVncpiEJn6eMkSkoQ+ioTC360VLMkKvJL1PTJEETV2DlaJ/1XOC/a0Qz1qUMDJoXXkOLltq1erAEEL8W3TugG+UAePHYPpFJvbCfbZj5SCZhTrhpMhJ79N41nGZwPkgSRy2Sy6+m30sSsKrC+LO7LtZ6n9g8mi5ToybVTs6+JLS2VNYkSdjkh61so2RkFEXRJFdkiFcHOni3c2bVanMX21IIscBZfBBJ8zLnk/DbWVccWx0hyILmQMzidShlrwFyofpMENcEDq40cngd8zF0bluRZS2rYI3jiXxIo2+gm0yEZcaiH1i4sHsCXA/rr3XJfLFqRRowIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
