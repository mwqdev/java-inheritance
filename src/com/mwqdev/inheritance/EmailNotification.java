package com.mwqdev.inheritance;

/**
 * Created by micha on 8/8/2017.
 */

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void showStatus() {
        super.showStatus();
    }

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(super.getCreatedAt());
        System.out.println(super.getSubject());
        System.out.println(super.getBody());
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
        super.showStatus();
    }

    @Override
    public void printText() {
        super.printText();
        System.out.println("Some more text");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }

}
