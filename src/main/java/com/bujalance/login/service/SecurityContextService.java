package com.bujalance.login.service;

import org.springframework.security.core.context.SecurityContext;

public interface SecurityContextService {

    SecurityContext getContext();
    void setContext(SecurityContext pContext);
}
