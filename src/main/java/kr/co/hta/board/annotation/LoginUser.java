package kr.co.hta.board.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)//retention 어노테이션 정보의 해석 지점 지정 runtime 실행시
@Documented//문서에 어노테이션 정보가 표시되게 한다.
public @interface LoginUser {
	
}
