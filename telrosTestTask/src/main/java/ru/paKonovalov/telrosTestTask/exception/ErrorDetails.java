package ru.paKonovalov.telrosTestTask.exception;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String massage;
    private String details;

    public Date getTimestamp() {
        return timestamp;
    }

    public ErrorDetails(Date timestamp, String massage, String details) {
        this.timestamp = timestamp;
        this.massage = massage;
        this.details = details;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
