package objectAdapter.outer;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;    }
}
