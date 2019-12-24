package baidu.controller;

import baidu.entity.Herf;
import baidu.entity.Pic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author peng.liu
 * @data 2019/12/10 9:50
 */
@RestController
@RequestMapping("/baidudemo")
public class baiduController {
    @Autowired
    baidu.service.baiduService baiduService;
    @RequestMapping("/queryPic")
    public Pic queryPic(){
        return baiduService.queryPic();
    }
    @RequestMapping("/queryHerfs")
    public List<Herf> queryHerfs(){
        return baiduService.queryHerfs();
    }
    @RequestMapping("/updatePic")
    public void updatePic(Pic pic){
        baiduService.updatePic(pic);
    }
    @RequestMapping("/updateHerf")
    public void updatePic(Herf herf){
        baiduService.updateHerf(herf);
    }
}
