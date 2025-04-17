public interface Action<I, O> {
    String getActionName();
    O runAction(AuthContext auth, I input);
}