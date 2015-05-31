/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.ws;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Willian
 */
@ServerEndpoint("/endpoint")
public class SocketEndPoint {
     private static  Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());
    @OnMessage
    public String onMessage(String message) {
       
        return null;
    }
    public static void sendMessage(String message){
        for(Session s:peers){
            try {
                s.getBasicRemote().sendText(message);
            } catch (IOException ex) {
                Logger.getLogger(SocketEndPoint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @OnOpen
    public void onOpen(Session peer){
        peers.add(peer);
    }
    
    @OnClose
    public void onClose(Session peer){
        peers.remove(peer);
    }
    
}
