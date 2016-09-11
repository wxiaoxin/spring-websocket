package com.xx.spring.websocket.socket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.net.URI;


/**
 * Created by Administrator on 2016/9/11.
 *
 * 处理文本消息的WebSocket处理器
 *
 */

public class MarcoHandlerSocket extends TextWebSocketHandler {


    /**
     * 处理文本消息
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("接收到消息：" + message.getPayload());
        Thread.sleep(2000);
        session.sendMessage(new TextMessage("这是服务端通过WebSocket发送的消息"));
    }


    /**
     * websocket建立连接后回调方法
     * @param session
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        URI uri = session.getUri();
        System.out.println("与 " + uri.toString() + " 建立连接");
    }

    /**
     * websocket连接关闭后回调方法
     * @param session
     * @param status
     * @throws Exception
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("与 " + session.getUri().toString() + " 的连接关闭");

    }
}
