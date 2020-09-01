package objectAdapter.adapter;

import objectAdapter.baseinfo.IUserInfo;
import objectAdapter.outer.IOuterUserBaseInfo;
import objectAdapter.outer.IOuterUserHomeInfo;
import objectAdapter.outer.IOuterUserOfficeInfo;

public class OuterUserInfo implements IUserInfo {
    private IOuterUserBaseInfo userBaseInfo;
    private IOuterUserHomeInfo userHomeInfo;
    private IOuterUserOfficeInfo userOfficeInfo;

    public OuterUserInfo(IOuterUserBaseInfo userBaseInfo, IOuterUserHomeInfo userHomeInfo, IOuterUserOfficeInfo userOfficeInfo) {
        this.userBaseInfo = userBaseInfo;
        this.userHomeInfo = userHomeInfo;
        this.userOfficeInfo = userOfficeInfo;
    }



    @Override
    public String getUserName() {
        return userBaseInfo.getUserBaseInfo().get("userName");
    }

    @Override
    public String getHomeAddress() {
        return userHomeInfo.getUserHomeInfo().get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return userBaseInfo.getUserBaseInfo().get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return userOfficeInfo.getUserOfficeInfo().get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return userOfficeInfo.getUserOfficeInfo().get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return userHomeInfo.getUserHomeInfo().get("homeTelNumber");
    }
}
