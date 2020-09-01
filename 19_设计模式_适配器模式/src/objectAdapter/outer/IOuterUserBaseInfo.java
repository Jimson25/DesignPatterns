package objectAdapter.outer;

import java.util.Map;

/**
 * 用户基本信息接口
 */
public interface IOuterUserBaseInfo {
    //基本信息，比如名称、性别、手机号码等
    public Map<String, String> getUserBaseInfo();
}
