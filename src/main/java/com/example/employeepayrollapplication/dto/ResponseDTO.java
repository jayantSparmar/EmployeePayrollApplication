package com.example.employeepayrollapplication.dto;

/* ResponseDTO is data transfer object send as response to client */
public class ResponseDTO {
    //private String message;
    private Object data;


    public ResponseDTO(Object data) {
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
