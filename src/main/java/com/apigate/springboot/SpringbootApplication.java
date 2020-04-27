package com.apigate.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.boot.EnablePrometheusMetrics;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;

@EnableSpringBootMetricsCollector
@EnablePrometheusMetrics
@SpringBootApplication

public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
