package edu.javacourse.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageResponse implements Serializable{
     private boolean existing;

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }
}
