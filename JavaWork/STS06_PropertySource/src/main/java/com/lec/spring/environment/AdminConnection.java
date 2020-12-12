package com.lec.spring.environment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String adminId;
	private String adminPw;

	// 빈 생성될때 호출
	// afterPropertiesSet() 이전에 호출, 즉 InitializingBean 보다 먼저 호출 됨에 주목
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment() 호출");
		setEnv(environment);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() 호출");
		// 설정 파일의 property 들.
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}
	
	@Override
	public void destroy() throws Exception {
		
	}

	
	// getter, setter
	public final Environment getEnv() {
		return env;
	}
	public final void setEnv(Environment env) {
		this.env = env;
	}

	public final String getAdminId() {
		return adminId;
	}
	public final void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public final String getAdminPw() {
		return adminPw;
	}
	public final void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
}