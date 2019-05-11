package cn.imust.service;

public interface IAccountService {
    /**
     * 模拟保存账户
     *      无参无返回值
     */
    void saveAccount();

    /**
     * 模拟更新用户
     *      有参无返回值
     * @param i
     */
    void updateAccount(int i);

    /**
     * 模拟删除账户
     *      无参有返回值
     * @return
     */
    int deleteAccount();
}
