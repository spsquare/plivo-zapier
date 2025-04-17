public interface IService {
    String getName();
    AuthProvider getAuthProvider();
    List<Action<?, ?>> getActions();
}