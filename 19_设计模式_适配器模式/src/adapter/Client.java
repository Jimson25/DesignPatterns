package adapter;

import adapter.adapter.AdapterInfo;
import adapter.baseinfo.IUserInfo;
import adapter.baseinfo.UserInfo;

public class Client {
    public static void main(String[] args) {
        IUserInfo info = new UserInfo();
        info.getUserName();
        info = new AdapterInfo();
        System.out.println(info.getUserName());
    }
}
