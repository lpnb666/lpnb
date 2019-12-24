package baidu.service;

import baidu.entity.Herf;
import baidu.entity.Pic;
import baidu.mapper.baiduMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author peng.liu
 * @data 2019/12/10 9:51
 */
@Service
public class baiduService {
    @Resource
    baiduMapper baiduMapper;

    public Pic queryPic() {
        return baiduMapper.queryPic();
    }

    public List<Herf> queryHerfs() {
         return baiduMapper.queryHerfs();
    }

    public void updatePic(Pic pic) {
        baiduMapper.updatePic(pic);
    }

    public void updateHerf(Herf herf) {
        baiduMapper.updateHerf(herf);
    }
}
