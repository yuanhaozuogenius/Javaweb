package com.spring.serv;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.io.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.springmvc.lc.Controllers")
public class LoveCalculatorAppconfig implements WebMvcConfigurer {

	// setup viewResolver

	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("test");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		System.out.println("view" + viewResolver);
		return viewResolver;

	}

	@Bean
	public MessageSource messagesource() {

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

		messageSource.setBasename("messages");
		return messageSource;

	}

	@Bean(name = "validator")
	public LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messagesource());

		return localValidatorFactoryBean;

	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		System.out.println("inside formatter method");
		registry.addFormatter(new PhoneNumberFormatter());
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

}
