// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adssearchapi.v13;

import jp.co.yahoo.adssearchapi.v13.oauth2.OAuth2TokenService;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class YahooJapanAdsApiClient extends ApiClient {

  private static final String USER_AGENT = "Java/jp.co.yahoo.api-ads:ads-search-api-lib:7.0.0-spring5";

  private final OAuth2TokenService oAuth2TokenService;

  public YahooJapanAdsApiClient(String clientId, String clientSecret, String refreshToken) {
    this(new OAuth2TokenService(clientId, clientSecret, refreshToken));
  }

  public YahooJapanAdsApiClient(OAuth2TokenService oAuth2TokenService) {
    super();
    setUserAgent(USER_AGENT);
    this.oAuth2TokenService = oAuth2TokenService;
  }

  public YahooJapanAdsApiClient(String clientId, String clientSecret, String refreshToken, RestTemplate restTemplate) {
    this(new OAuth2TokenService(clientId, clientSecret, refreshToken), restTemplate);
  }

  public YahooJapanAdsApiClient(OAuth2TokenService oAuth2TokenService, RestTemplate restTemplate) {
    super(restTemplate);
    setUserAgent(USER_AGENT);
    this.oAuth2TokenService = oAuth2TokenService;
  }

  @Override
  protected void updateParamsForAuth(String[] authNames, MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
    headerParams.add(HttpHeaders.AUTHORIZATION, "Bearer " + oAuth2TokenService.getAccessToken());
  }

}
