package com.ta.server.enumeration;

public enum Status {
    SERVER_UP("Server_Up"),
    SERVER_DOWN("Server_Down");
    private final String status;


    Status(String status) {
        this.status = status;
    }

    public String getStatus()
              {
        return this.status;
    }

}
