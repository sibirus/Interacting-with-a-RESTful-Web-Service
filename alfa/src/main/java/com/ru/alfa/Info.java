/**
 * Для начала, вы создаете класс, который содержит необходимую вам информацию,
 * полученную с api.Он содержит аннотацию @JsonIgnoreProperties библиотеки обработки JSON Jackson,
 * которая показывает, что любые поля, не связанные с полями класса, должны быть проигнорированы.
 */
package com.ru.alfa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Info
{



    private String base;
    private Double RUB;
    private Map<String,Double> rates;

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
