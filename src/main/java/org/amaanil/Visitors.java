package org.amaanil;

import org.springframework.stereotype.Component;

@Component
public class Visitors {
    private String Name;
    private String timestamp;

    public Visitors(String name, String timestamp) {
        Name = name;
        this.timestamp = timestamp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Visitors{" +
                "Name='" + Name + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
