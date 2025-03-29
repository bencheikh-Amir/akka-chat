package com.examples;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;

public class ChatActor extends AbstractBehavior<ChatActor.ChatMessage> {
    public static class ChatMessage {
        public final String from;
        public final String message;

        public ChatMessage(String from, String message) {
            this.from = from;
            this.message = message;
        }
    }

    public static Behavior<ChatMessage> create() {
        return Behaviors.setup(ChatActor::new);
    }

    private ChatActor(ActorContext<ChatMessage> context) {
        super(context);
    }

    @Override
    public Receive<ChatMessage> createReceive() {
        return newReceiveBuilder()
            .onMessage(ChatMessage.class, this::onMessageReceived)
            .build();
    }

    private Behavior<ChatMessage> onMessageReceived(ChatMessage msg) {
        System.out.println("Received from " + msg.from + ": " + msg.message);
        return this;
    }
}
