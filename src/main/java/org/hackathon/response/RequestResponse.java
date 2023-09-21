package org.hackathon.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestResponse<T> implements Serializable {

    private Boolean success;
    private String message;
    private T data;

    private RequestResponse() {
    }

    private RequestResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    private RequestResponse(T data) {
        this.data = data;
        this.success = true;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> RequestResponse<T> success(T data) {
        return new RequestResponse<T>(data);
    }

    public static <T> RequestResponse<T> success() {
        return new RequestResponse<T>(null, true);
    }

    public static <T> RequestResponse<T> failure(String message) {
        return new RequestResponse<T>(message, false);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestResponse{");
        sb.append("success=").append(success);
        sb.append(", message='").append(message).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
