package cn.imust.service.impl;

import cn.imust.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("无参无返回值的模拟保存账户");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("有参无返回值的模拟更新用户" + (i/0));
    }

    @Override
    public int deleteAccount() {
        System.out.println("无参有返回值的模拟删除账户");
        return 0;
    }
}
