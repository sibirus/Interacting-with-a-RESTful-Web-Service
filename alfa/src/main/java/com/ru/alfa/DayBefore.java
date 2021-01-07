package com.ru.alfa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DayBefore
{

    private String base;//базовая валюта
    private Double RUB;//ставка в рублях на день назад
    private Map<String, Double> rates;//ставки в валютах на на день назад

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Double getRUB() {
        return RUB;
    }

    public void setRUB(Double RUB) {
        this.RUB = RUB;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
