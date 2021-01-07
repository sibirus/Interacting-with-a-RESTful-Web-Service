package com.ru.alfa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class AlfaController
{

    @GetMapping("/greeting")
    public String x ( Map<String, Object> model)
    {

        Info info= ClientService.getInfo();
        DayBefore before=ClientService.getBefore();
        Double b=info.getRUB();
        Double c=before.getRUB();
        model.put("b",b);
        model.put("c",c);
        if(b<c)
        {
            return "indexTwo";
        }
        else
        {
           return "index";
        }
    }



}
