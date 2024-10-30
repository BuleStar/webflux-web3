package com.example.webfluxweb3.task;

import com.example.webfluxweb3.service.BinanceService;
import com.binance.api.client.domain.market.TickerPrice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceFetchTask {

    private static final Logger logger = LoggerFactory.getLogger(PriceFetchTask.class);

    private final BinanceService binanceService;

    @Autowired
    public PriceFetchTask(BinanceService binanceService) {
        this.binanceService = binanceService;
    }

    @Scheduled(fixedRate = 60000)
    public void fetchPrices() {
        List<TickerPrice> prices = binanceService.getPrices();
        prices.forEach(price -> logger.info("Symbol: {}, Price: {}", price.getSymbol(), price.getPrice()));
    }
}
