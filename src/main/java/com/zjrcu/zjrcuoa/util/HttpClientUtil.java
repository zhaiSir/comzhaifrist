package com.zjrcu.zjrcuoa.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.params.CoreConnectionPNames;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpClientUtil {
    public static String doPost(String url, Map<String,String> params){
        String result = "-1";
        HttpClient client = null;
        PostMethod postMethod = null;
        try {
            NameValuePair[] data = new NameValuePair[params.size()];
        /*Set set = params.entrySet();
        Iterator iterator = set.iterator();*/
            Iterator iterator = params.entrySet().iterator();
            int i = 0;
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry) iterator.next();
                String key = entry.getKey();
                String value = entry.getValue();
                data[i] = new NameValuePair(key, URLEncoder.encode(value, "utf-8"));
                i++;
            }
            client = new HttpClient();
            //设置连接请求超时和数据返回超时
            client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,10000.);
            client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,10000.);
            postMethod = new PostMethod();
            postMethod.setRequestBody(data);
            client.executeMethod(postMethod);
            result = postMethod.getResponseBodyAsString();
        }
        catch(Exception e){
            System.out.println("HttpClientUnit.dopost excepption"+e);//请求超时也会返回异常信息
        }finally{//关闭连接
            if(postMethod!=null){
                postMethod.releaseConnection();
            }
            if(client!=null){
                client.getHttpConnectionManager().closeIdleConnections(0);
            }
        }
        return result;
    }
}
