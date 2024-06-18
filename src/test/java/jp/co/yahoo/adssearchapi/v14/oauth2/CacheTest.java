// DO NOT EDIT THIS FILE, THIS FILE IS AUTO GENERATED!
package jp.co.yahoo.adssearchapi.v14.oauth2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class CacheTest {

  @Test
  void getInstance() {
    // setup
    Cache cache1 = Cache.getInstance();
    Cache cache2 = Cache.getInstance();

    assertSame(cache1, cache2);
  }

  @Test
  void get() {
    // setup
    Cache target = Cache.getInstance();
    OAuth2AccessTokenResponse oAuth2AccessTokenResponse = new OAuth2AccessTokenResponse();
    target.put("test", oAuth2AccessTokenResponse);

    assertEquals(oAuth2AccessTokenResponse, target.get("test"));
    assertNull(target.get("non_existent_key"));
  }

  @Test
  void put() {
    // setup
    Cache target = Cache.getInstance();
    OAuth2AccessTokenResponse oAuth2AccessTokenResponse = new OAuth2AccessTokenResponse();

    assertDoesNotThrow(() -> target.put("test", oAuth2AccessTokenResponse));
  }

}
