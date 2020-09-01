package adapter.outerinfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterInfo {
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
