/*
 * Copyright (c) 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.spring.context.annotation;

import java.lang.annotation.*;

/**
 * @author Jon Brisbin
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface On {

	/**
	 * An expression that evaluates to the {@link reactor.core.Reactor} on which
	 * to place this handler.
	 * 
	 * @return An expression to be evaluated.
	 */
	String reactor() default "";

	/**
	 * An expression that evaluates to a {@link reactor.fn.Selector} to register
	 * this handler with the {@link reactor.core.Reactor}.
	 * 
	 * @return An expression to be evaluated.
	 */
	String selector() default "";

}
