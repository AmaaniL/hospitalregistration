package org.amaanil;

import java.time.LocalDateTime;

public class Visitors {
    static class Names {
        private String name;

        private LocalDateTime timestamp;

        public Names(String name, LocalDateTime timestamp) {
            this.name = name;
            this.timestamp = timestamp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }
    }
}
