public interface AuthProvider {
    String getType();
    String getAuthorizeUrl();
    String getAccessToken(String accessDetails);
    String refreshToken(String refreshDetails);
}