package dio.my_first_web_api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date(); //timestamp momento exato da execução
    private String status = "error";
    private int statusCode = 400; //dicionario de erros da aplicação
    private String error;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
