package com.apigate.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import the Prometheus packages.
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
// Prometheus counter package.
import io.prometheus.client.Counter;
// Prometheus Histogram package.
import io.prometheus.client.Histogram;

@SpringBootApplication
//@EnablePrometheusMetrics
@RestController
// Add a Prometheus metrics enpoint to the route `/prometheus`. `/metrics` is already taken by Actuator.
@EnablePrometheusEndpoint
// Pull all metrics from Actuator and expose them as Prometheus metrics. Need to disable security feature in properties file.
@EnableSpringBootMetricsCollector
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
