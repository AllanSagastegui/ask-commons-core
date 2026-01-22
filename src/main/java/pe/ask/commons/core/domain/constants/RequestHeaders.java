package pe.ask.commons.core.domain.constants;

public final class RequestHeaders {

    private RequestHeaders() {}

    public static final String CORRELATION_ID = "X-Correlation-Id";
    public static final String TRACE_ID = "X-Trace-Id";

    public static final String USER_ID = "X-User-Id";
    public static final String USER_EMAIL = "X-User-Email";
    public static final String USER_ROLES = "X-User-Roles";
    public static final String TENANT_ID = "X-Tenant-Id";

    public static final String AUTH_PREFIX = "Bearer ";
}