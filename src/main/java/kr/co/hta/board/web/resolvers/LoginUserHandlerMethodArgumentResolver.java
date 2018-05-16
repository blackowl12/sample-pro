package kr.co.hta.board.web.resolvers;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import kr.co.hta.board.annotation.LoginUser;
import kr.co.hta.board.vo.User;

public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver{
	//핸들러 메소드의 매개변수를 해석
	//매개변수 리졸브를 적용할 수 있는 대상인지 검사하는 역할을 수행한다.
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		// TODO Auto-generated method stub
		return parameter.hasParameterAnnotation(LoginUser.class);
	}
	
	//supportsParameter()이 true를 반환할 때 실행되는 메소드다.
	//resolverArgument() 메소드가 반환하는 객체가 그 매개변수로 전달된다.
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		// LoginUser가 부착된 파라미터가 있으면 실행된다.
		return (User)webRequest.getAttribute("LOGIN_USER", NativeWebRequest.SCOPE_SESSION);
	}
}
