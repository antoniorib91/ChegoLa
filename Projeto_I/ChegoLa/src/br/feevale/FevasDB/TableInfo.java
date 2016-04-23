package br.feevale.FevasDB;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TableInfo {

	public String tableName();
	public String alias() default "";
}