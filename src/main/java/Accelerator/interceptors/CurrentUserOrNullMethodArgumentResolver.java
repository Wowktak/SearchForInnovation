package Accelerator.interceptors;


import Accelerator.Services.UserService;
import Accelerator.annotate.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Service
public class CurrentUserOrNullMethodArgumentResolver implements HandlerMethodArgumentResolver {
    /*@Autowired
    JwtService jwtService;*/

    @Autowired
    UserService userService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(CurrentUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        String id = webRequest.getHeader("ID");
        if (!StringUtils.hasLength(id) ) {
            throw new UsernameNotFoundException(" User not found");
        }
        return userService.getById(Long.parseLong(id)) ;
    }
}