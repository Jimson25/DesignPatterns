package template;

/**
 *  该角色定义把其他类转换为何种接口，
 *  也就是我们的期望接口，例子中的IUserInfo接口就是目标角色
 */
public interface Target {
    public void request();
}
