public class GmailService implements IService {
    @Override
    public String getName() {
        return "gmail";
    }

    @Override
    public AuthProvider getAuthProvider() {
        return new GmailAuthProvider();
    }

    @Override
    public List<Action<?, ?>> getActions() {
        //Can add all actions available
        return List.of(new SendEmailAction());
    }
}
