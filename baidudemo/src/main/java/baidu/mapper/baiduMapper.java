package baidu.mapper;

import baidu.entity.Herf;
import baidu.entity.Pic;

import java.util.List;

/**
 * @author peng.liu
 * @data 2019/12/10 9:55
 */
public interface baiduMapper {
    Pic queryPic();

    List<Herf> queryHerfs();

    void updatePic(Pic pic);

    void updateHerf(Herf herf);
}
