package com.bridgelabz.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marker Annotation
 * Single value Annotation
 * Multi value Annotation
 */

//Meta Annotations
@Inherited
@Retention(RUNTIME)
@Target(TYPE)
public @interface SmartPhone {
	String os() default "Windows";
	double version() default 1.0;
}
