package login.service;
import login.entity.User;
import login.mapper.LoginMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author peng.liu
 * @data 2019/12/10 9:51
 */
@Service
public class LoginService {
    @Resource
    LoginMapper loginMapper;

    public boolean check(User user) {
            return loginMapper.check(user)==1;
    }

    public int get(User user) {
        return loginMapper.get(user);
    }
}
