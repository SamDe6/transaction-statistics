package com.n26.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.n26.model.Statistics;

@Service
public class CachedService {

	private static final Logger logger = LoggerFactory.getLogger(CachedService.class);
	private final AsyncService async;

	@Autowired
	public CachedService(AsyncService async) {
		this.async = async;
	}

	@Cacheable
	@Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
	public CompletableFuture<Statistics> getStats() {
		final CompletableFuture<Statistics> promise = new CompletableFuture<>();
		async.fetchStats(promise);
		return promise;
	}
	
	
}
