package org.amaanil;

import org.springframework.stereotype.Component;

@Component
public class Visitors {
    private String name;
    private String timestamp;
 private String doctorName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Visitors(String name, String timestamp, String doctorName) {
        this.name = name;
        this.timestamp = timestamp;
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Visitors{" +
                "name='" + name + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
