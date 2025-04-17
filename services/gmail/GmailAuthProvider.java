public class GmailAuthProvider implements AuthProvider {
    @Override
    public String getType() {
        return "oauth2";
    }

    @Override
    public String getAuthorizeUrl() {
        return "";
    }

    @Override
    public String getAccessToken(String accessDetails) {
        Map<String, Object> response = post("<auth-url>",<request-body-for-auth>);
        return (String) response.get("access_token");
    }

    @Override
    public String refreshToken(String refreshDetails) {
        Map<String, Object> response = post("<auth-url>",<request-body-for-refresh>);
        return (String) response.get("access_token");
    }
}