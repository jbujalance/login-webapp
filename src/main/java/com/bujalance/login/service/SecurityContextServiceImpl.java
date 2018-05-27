package com.bujalance.login.service;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SecurityContextServiceImpl implements SecurityContextService {

    @Override
    public SecurityContext getContext() {
        return SecurityContextHolder.getContext();
    }

    @Override
    public void setContext(SecurityContext pContext) {
        SecurityContextHolder.setContext(pContext);
    }
}
