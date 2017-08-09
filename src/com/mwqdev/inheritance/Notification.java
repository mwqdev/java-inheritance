package com.mwqdev.inheritance;

/**
 * Created by micha on 8/8/2017.
 */

import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status = "ok";

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public abstract void transport() throws NoTransportException;

    public void showStatus() {
        System.out.println(status);
    }

    protected void printText() {
        System.out.println("Some text");
    }

}
