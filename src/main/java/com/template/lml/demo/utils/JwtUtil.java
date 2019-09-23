package com.template.lml.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.template.lml.demo.domain.YamlEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;


/**
 * @ClassName JwtUtil
 * @Description JWT的工具类。生成和校验token
 * @Author lml
 * @Date2019/9/20 20:33
 * @Version V1.0
 **/

public class JwtUtil {

    private static Long EXPIRATION_TIME = 60000L;
    private static final String secret = "ioasdu9*(Hh9asdh898(HS(Dh9hasd9h";
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";

    public static JSONObject generateToken(String account) throws JSONException {
        // 获取当前时间
        Long now = System.currentTimeMillis();

        //生成过期时间
        Date expirationTime = new Date(now+EXPIRATION_TIME);

        Map<String,Object> map = new HashMap<>();
        map.put("account", account);

        String jwt = Jwts.builder()
                .setClaims(map)
                .setExpiration(expirationTime)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        JSONObject json = new JSONObject();
        json.put("token", TOKEN_PREFIX+" "+jwt);
        json.put("token-type", TOKEN_PREFIX);
        json.put("expire-time", new SimpleDateFormat("yyyy-mm-dd hh:ss:mm").format(expirationTime));
        return json;
    }

    public static Claims validateToken(String tokenStr) throws JSONException {

        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(tokenStr.replace(TOKEN_PREFIX,""))
                .getBody();
    }


}
