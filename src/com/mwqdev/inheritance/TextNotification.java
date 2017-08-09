package com.mwqdev.inheritance;

/**
 * Created by micha on 8/8/2017.
 */

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        super.printText();
    }

    @Override
    public void transport() {
        System.out.println(super.getBody());
        System.out.println(super.getSubject());
        System.out.println(super.getCreatedAt());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
    }

}
