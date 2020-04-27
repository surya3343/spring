package com.apigate.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.boot.EnablePrometheusMetrics;
//import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
package org.springframework.metrics.export.prometheus;
import org.springframework.context.annotation.Import;
import org.springframework.metrics.boot.EnableMetrics;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableMetrics
@EnablePrometheusScraping
@Import(PrometheusMetricsConfiguration.class)

@EnableSpringBootMetricsCollector
@EnablePrometheusMetrics
//@SpringBootApplication

public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
