package com.txd.comtrol;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 11982
 */
@Controller
@RequestMapping("project")
public class IndexController {

    @GetMapping("open")
    public String open(@RequestParam("id") Long id) {
        return "home/index";
    }

    @GetMapping("save")
    @ResponseBody
    public Map<String, Object> save(@RequestParam("id") Long id) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        return jsonObject;
    }
}
