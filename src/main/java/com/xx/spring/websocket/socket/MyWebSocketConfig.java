package com.xx.spring.websocket.socket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Administrator on 2016/9/11.
 *
 * WebSocket配置器
 *
 */

@Configuration
@EnableWebSocket
public class MyWebSocketConfig implements WebSocketConfigurer {


    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(marcoHandlerSocket(), "/websocket/macro");
    }

    @Bean
    public MarcoHandlerSocket marcoHandlerSocket(){
        return new MarcoHandlerSocket();
    }

}
