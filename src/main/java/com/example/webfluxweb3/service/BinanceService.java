package com.example.webfluxweb3.service;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinanceService {

    private final BinanceApiRestClient client;

    public BinanceService(@Value("${binance.api.key}") String apiKey, @Value("${binance.api.secret}") String apiSecret) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(apiKey, apiSecret);
        this.client = factory.newRestClient();
    }

    public List<TickerPrice> getPrices() {
        return client.getAllPrices();
    }
}
