package com.mwqdev.inheritance;

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("Subject", "Body Text", "Bob Roberts", "AOL");

        TextNotification textNotification = new TextNotification("Subject", "Body Text", "Rob Boberts", "Verizon");

        textNotification.transport();

        emailNotification.printText();

        try {
            Object emailNotificationClone = emailNotification.clone();
            System.out.println(emailNotification.equals(emailNotificationClone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
