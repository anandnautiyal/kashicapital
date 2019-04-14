package com.kcfinance.loans.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;
import org.apache.tiles.request.jsp.JspRequest;
import org.apache.tiles.request.servlet.ServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class AbstractViewPreparer implements ViewPreparer {

	public abstract void execute(Request tilesRequest, AttributeContext attributeContext) throws PreparerException;
	
	protected HttpServletRequest getServletRequest(Request viewRequest) {
        if (viewRequest != null) {
            if (viewRequest instanceof ServletRequest) {
                return ((ServletRequest) viewRequest).getRequest();
            }
            if (viewRequest instanceof JspRequest) {
                PageContext pageContext = ((JspRequest) viewRequest).getPageContext();
                if (pageContext != null && pageContext.getRequest() instanceof HttpServletRequest) {
                    return (HttpServletRequest) pageContext.getRequest();
                }
            }
        }
        return getServletRequest();
    }

    protected HttpServletResponse getServletResponse(Request viewRequest) {
        if (viewRequest != null) {
            if (viewRequest instanceof ServletRequest) {
                return ((ServletRequest) viewRequest).getResponse();
            }
            if (viewRequest instanceof JspRequest) {
                PageContext pageContext = ((JspRequest) viewRequest).getPageContext();
                if (pageContext != null && pageContext.getResponse() instanceof HttpServletResponse) {
                    return (HttpServletResponse) pageContext.getResponse();
                }
            }
        }
        return null;
    }

    protected HttpServletRequest getServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
    
}
