package com.n26.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.n26.model.Statistics;

@Service
public class AsyncService {
	private static Logger logger = LoggerFactory.getLogger(AsyncService.class);

	@Async
	void fetchStats(CompletableFuture<Statistics> promise) {
		// TODO
		logger.info("Entering async task!");
		
//		promise.complete(value);
	}
}
