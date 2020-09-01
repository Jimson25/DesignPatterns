package objectAdapter;

import objectAdapter.adapter.OuterUserInfo;
import objectAdapter.baseinfo.IUserInfo;
import objectAdapter.baseinfo.UserInfo;
import objectAdapter.outer.OuterUserBaseInfo;
import objectAdapter.outer.OuterUserHomeInfo;
import objectAdapter.outer.OuterUserOfficeInfo;

public class Client {
    public static void main(String[] args) {
        IUserInfo info = new UserInfo();
        info.getUserName();

        OuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        OuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        OuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        info = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        System.out.println(info.getUserName());
    }
}
