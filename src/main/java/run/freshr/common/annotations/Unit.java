package run.freshr.common.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/**
 * 유닛 서비스
 *
 * @author FreshR
 * @apiNote 논리적인 Architecture 를 설계하기 위한 Annotation<br>
 *          Service 와 똑같은 기능
 * @since 2024. 3. 26. 오후 3:01:38
 */
@Target({TYPE})
@Retention(RUNTIME)
@Documented
@Component
public @interface Unit {

  /**
   * Component class
   *
   * @return string string
   * @apiNote Service 에 있는 value 와 똑같은 기능
   * @author FreshR
   * @since 2024. 3. 26. 오후 3:01:38
   */
  @AliasFor(annotation = Component.class)
  String value() default "";

}
