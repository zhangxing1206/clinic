package cn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@Controller
@Slf4j
public class DemoController {
//    private String ssoServerUrl = "http://localhost:9001";
//    private String ssoCallbackUrl = "http://localhost:9005/login";
//    private String ssoClientId = "client";
//    private String ssoClientSecret = "secret";
//
//    @GetMapping("tologin")
//    public String toLogin() {
//        return "toLogin";
//    }
//
//    /**
//     * 第三方登录第一步，获取code
//     */
//    @GetMapping("/oauth2/code")
//    public void code(HttpServletResponse response) {
//        String params = "/oauth/authorize?response_type=code"
//                + "&client_id=" + ssoClientId
//                + "&redirect_uri" + ssoCallbackUrl
//                + "&scope=app";
//        try {
//            response.sendRedirect(ssoServerUrl + params);
//        } catch (IOException e) {
//            log.error(e.getMessage(), e);
//        }
//        log.info("发送请求成功：{},{}", ssoCallbackUrl, params);
//    }
//
//    /**
//     * 第三方登录第二步
//     */
//    @GetMapping("/login")
//    public String callback(String code, HttpServletResponse resp, Model model) {
//        {
//            CloseableHttpClient httpClient = null;
//            CloseableHttpResponse response = null;
//            try {
//                httpClient = HttpClientBuilder.create().build();
//                HttpPost httpPost = new HttpPost(ssoServerUrl + "/oauth/token");
////           构造post参数
//                List<NameValuePair> list = new ArrayList<NameValuePair>();
//                list.add(new BasicNameValuePair("grant_type", "authorization_code"));
//                list.add(new BasicNameValuePair("scope", "app"));
//                list.add(new BasicNameValuePair("redirect_uri", ssoCallbackUrl));
//                list.add(new BasicNameValuePair("code", code));
//                list.add(new BasicNameValuePair("client_id", ssoClientId));
//                list.add(new BasicNameValuePair("client_secret", ssoClientSecret));
//                log.debug("请求参数:{}", list);
//                UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(list);
//                httpPost.setEntity(formEntity);
//                //发送请求，获取响应(默认只支持post)
//                response = httpClient.execute(httpPost);
//                HttpEntity httpEntity = response.getEntity();
//                log.debug("响应状态:{}", response.getStatusLine());
//                String result = null;
//                if (httpEntity != null) {
//                    result = EntityUtils.toString(response.getEntity());
//                    log.debug("响应内容长度:{}", httpEntity.getContentLength());
//                    log.debug("响应内容：{}", result);
//                }
//                if (response.getStatusLine().getStatusCode() == 200) {
//                    //取出access_token值
//                    ObjectMapper om = new ObjectMapper();
//                    @SuppressWarnings("unchecked")
//                    Map<String, String> map = om.readValue(result, Map.class);
//                    log.info("成功获取到令牌:{}", map);
//                    model.addAttribute("token", map);
//                    return "redirect:/call_api?access_token=" + map.get("access_token");
//                } else {
//                    log.error(result);
//                }
//            } catch (Exception e) {
//                log.error(e.getMessage(), e);
//            } finally {
//                HttpClientUtils.closeQuietly(response);
//                HttpClientUtils.closeQuietly(httpClient);
//            }
//            return "error";
//        }
//    }
//    @GetMapping("/call_api")
//    public String callback(String access_token,Model model){
//            CloseableHttpClient httpClient = null;
//            CloseableHttpResponse response = null;
//            try {
//                httpClient = HttpClientBuilder.create().build();
//                HttpGet httpGet = new HttpGet("http://localhost:9003/content/list?categoryId=1&access_token=" + access_token);
//                //发送请求，获取响应
//                response = httpClient.execute(httpGet);
//                HttpEntity httpEntity=response.getEntity();
//                log.debug("响应状态:{}",response.getStatusLine());
//                String result = null;
//                if (httpEntity != null) {
//                    result = EntityUtils.toString(response.getEntity());
//                    log.debug("响应内容长度:{}", httpEntity.getContentLength());
//                    log.debug("响应内容：{}", result);
//                }
//                if (response.getStatusLine().getStatusCode() == 200) {
//                    //取出access_token值
//                    ObjectMapper om = new ObjectMapper();
//                    @SuppressWarnings("unchecked")
//                   List<Map<String, String>> list = om.readValue(result, List.class);
//                    log.info("成功获取到服务器资源:{}", list);
//                    model.addAttribute("data", list);
//                    return "index";
//                } else {
//                    log.error(result);
//                }
//            } catch (Exception e) {
//                log.error(e.getMessage(), e);
//            } finally {
//                HttpClientUtils.closeQuietly(response);
//                HttpClientUtils.closeQuietly(httpClient);
//            }
//            return "error";
//    }
//

}
