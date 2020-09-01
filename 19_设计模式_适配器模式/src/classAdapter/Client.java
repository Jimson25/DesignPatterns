package classAdapter;

import classAdapter.adapter.AdapterInfo;
import classAdapter.baseinfo.IUserInfo;
import classAdapter.baseinfo.UserInfo;

public class Client {
    public static void main(String[] args) {
        IUserInfo info = new UserInfo();
        info.getUserName();
        info = new AdapterInfo();
        System.out.println(info.getUserName());
    }
}
