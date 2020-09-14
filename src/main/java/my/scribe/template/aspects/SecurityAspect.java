package my.scribe.template.aspects;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import my.scribe.template.exceptions.AuthorizationException;

@Aspect
@Component
public class SecurityAspect {
    
    @Before("execution(* my.scribe.template.repositories.*.*(..))")
    public void beforeStatus(JoinPoint thisJoinPoint) {
        System.err.println("entering: " + thisJoinPoint);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        
        System.out.println();

        if (request.getHeader("x-api-key")==null) {
            
                throw new AuthorizationException("Erreur");
            
        }
        System.out.println("End BeforeStatus");

    }

}
