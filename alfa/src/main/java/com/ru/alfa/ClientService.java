package com.ru.alfa;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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
        RestTemplate restTemplate = new RestTemplate();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String date = dateFormat.format(cal.getTime());

        DayBefore before = restTemplate.getForObject("https://openexchangerates.org/api/historical/"+date+".json?app_id=db83e7f7a93349b2af69f6bd73b95182", DayBefore.class);
        before.setRUB(before.getRates().get("RUB"));
        return before;
    }

}
