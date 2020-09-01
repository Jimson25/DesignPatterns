package classAdapter.adapter;

import classAdapter.baseinfo.IUserInfo;
import classAdapter.outerinfo.OuterUser;

public class AdapterInfo extends OuterUser implements IUserInfo {
    @Override
    public String getUserName() {
        return super.getUserBaseInfo().get("userName");
    }

    @Override
    public String getHomeAddress() {
        return super.getUserHomeInfo().get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return super.getUserBaseInfo().get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return super.getUserOfficeInfo().get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return super.getUserOfficeInfo().get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return super.getUserHomeInfo().get("homeTelNumber");
    }
}
