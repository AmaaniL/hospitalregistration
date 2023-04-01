package org.amaanil;


import java.time.LocalDateTime;

public class Visitors {
    static class Names {


        private String name;
        private String timestamp;

        public String getName() {
            return name;
        }

        public Names(String name, String timestamp) {
            this.name = name;
            this.timestamp = timestamp;
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

        @Override
        public String toString() {
            return "Names{" +
                    "name='" + name + '\'' +
                    ", timestamp='" + timestamp + '\'' +
                    '}';
        }
    }
}
