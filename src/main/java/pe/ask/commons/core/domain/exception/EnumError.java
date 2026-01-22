package pe.ask.commons.core.domain.exception;

import java.util.Map;

public interface EnumError {
    String getErrorCode();
    String getExceptionName();
    String getMessage();
    int getStatus();
    Map<String, String> getErrors();
}
