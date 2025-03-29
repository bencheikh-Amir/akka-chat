package com.examples;

import akka.actor.typed.ActorSystem;

public class ChatApp {
    public static void main(String[] args) {
        ActorSystem<ChatActor.ChatMessage> chatSystem =
                ActorSystem.create(ChatActor.create(), "ChatSystem");

        // Send test messages
        chatSystem.tell(new ChatActor.ChatMessage("User1", "Hello, Akka!"));
        chatSystem.tell(new ChatActor.ChatMessage("User2", "Hi there!"));
    }
}
