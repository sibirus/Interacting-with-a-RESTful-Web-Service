package com.ru.alfa;

import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;



public class ClientService
{
    public static Info getInfo ()
    {
        RestTemplate restTemplate = new RestTemplate();
        Info info = restTemplate.getForObject("https://openexchangerates.org/api/latest.json?app_id=db83e7f7a93349b2af69f6bd73b95182", Info.class);
        info.setRUB(info.getRates().get("RUB"));
        return info;


    }

    public static DayBefore getBefore ()
    {
        LocalDate date= LocalDate.now();
        date=date.minusDays(1);
        String i=date.toString();
        RestTemplate restTemplate = new RestTemplate();
        DayBefore before = restTemplate.getForObject("https://openexchangerates.org/api/historical/"+i+".json?app_id=db83e7f7a93349b2af69f6bd73b95182", DayBefore.class);
        before.setRUB(before.getRates().get("RUB"));
        return before;
    }

}
