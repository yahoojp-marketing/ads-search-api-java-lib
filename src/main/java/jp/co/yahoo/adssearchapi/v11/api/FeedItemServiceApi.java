package jp.co.yahoo.adssearchapi.v11.api;

import jp.co.yahoo.adssearchapi.v11.ApiClient;

import jp.co.yahoo.adssearchapi.v11.model.FeedItemServiceGetResponse;
import jp.co.yahoo.adssearchapi.v11.model.FeedItemServiceSelector;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("jp.co.yahoo.adssearchapi.v11.api.FeedItemServiceApi")
public class FeedItemServiceApi {
    private ApiClient apiClient;

    public FeedItemServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public FeedItemServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードアイテム情報を取得します。&lt;br&gt; ※現在、こちらのサービスは利用できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Get Feed Item information.&lt;br&gt; *Currently this service is not available.&lt;/div&gt; 
     * <p><b>503</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0099&lt;/td&gt;&lt;td&gt;Out of service.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;APIがメンテナンス中、またはご利用できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;API is under maintenance or not available to use.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>500</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0002&lt;/td&gt;&lt;td&gt;An internal error has occurred.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;内部エラーが発生しました。再度操作を実行してください。 &lt;br&gt;もし、問題が解決しない場合は、お問い合わせページをご利用ください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;An internal error has occurred. Please try again later. &lt;br&gt;If the problem continues, please contact the support team via Inquiry page for assistance. &lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>200</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0001&lt;/td&gt;&lt;td&gt;Invalid Request.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;さまざまな要因が考えられます。&lt;br&gt;主な要因は、パラメータの値が不正か、誤りがあるためにオペレーションが完了できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;This error can result for a variety of reasons. &lt;br&gt;Typically because one of the parameter values in the request is wrong or invalid and the operation cannot be completed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;R0001&lt;/td&gt;&lt;td&gt;Require.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;必須です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It is missing required parameter.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;F0001&lt;/td&gt;&lt;td&gt;Invalid format.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値の形式が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value format is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;V0001&lt;/td&gt;&lt;td&gt;Invalid value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値が無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;S0001&lt;/td&gt;&lt;td&gt;Invalid Status.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;ステータスが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The status is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0002&lt;/td&gt;&lt;td&gt;Over list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array exceeds the upper limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0001&lt;/td&gt;&lt;td&gt;Lower list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が下限値を下回っています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array is below the lower limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;D0001&lt;/td&gt;&lt;td&gt;Duplicate.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;一意な値が重複しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The unique value is duplicated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;RL001&lt;/td&gt;&lt;td&gt;Invalid relation.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;リクエストの関連性が矛盾しています。&lt;br&gt; たとえば、開始＞終了の日付指定を行なっているなど&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The relation of the request is contradictory.&lt;br&gt; For example, you are specifying the date of start &gt; end.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;LT001&lt;/td&gt;&lt;td&gt;Over limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録できる上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The upper limit value that can be registered is exceeded.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;I0001&lt;/td&gt;&lt;td&gt;Deactivated Id.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;IDが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The ID is Deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210110&lt;/td&gt;&lt;td&gt;Invalid target&lt;/td&gt;&lt;td&gt;１日のスケジュール指定が上限値（6件）を超えています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The daily schedule specification exceeds the upper limit (6 cases).&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210517&lt;/td&gt;&lt;td&gt;Exceeds maximum word limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードは最大10個までしか指定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;10 keywords can only be specified up to.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210126&lt;/td&gt;&lt;td&gt;Mobile app download cannot connect to.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリダウンロードキャンペーンは設定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Mobile app download cannot connect to.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210123&lt;/td&gt;&lt;td&gt;Campaign targeting mismatch&lt;/td&gt;&lt;td&gt;targetingCampaignIdで指定したキャンペーンIDと、targetingAdGroupIdで指定した広告グループの上位キャンペーンIDが異なるため、設定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It can not be set because the campaign ID specified by targetingCampaignId is different from the campaign ID of the ad group specified by targetingAdGroupId.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211000&lt;/td&gt;&lt;td&gt;Cannot operate AdvancedURL(FinalURL).&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アドバンスドURLに移行済みのため、操作できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Since it has already been transferred to AdvancedURL(FinalURL), it can not be operated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211001&lt;/td&gt;&lt;td&gt;Cannot set AdvancedMobileURL(SmartphoneFinalURL).&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリダウンロードキャンペーンでは、advancedMobileURL(smartphoneFinalURL)の設定はできません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;In the app download campaign, AdvancedMobileURL(SmartphoneFinalURL) can not be set.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211003&lt;/td&gt;&lt;td&gt;Domain does not match with DisplayURL.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;表示URLと最終リンク先URLのドメインが一致していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain of DisplayURL and AdvancedURL(FinalURL) do not match.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211004&lt;/td&gt;&lt;td&gt;Cannot set under AndroidCampaign.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;Androidのアプリキャンペーンでは、以下の設定ができません：&lt;br&gt;・キャンペーン、広告グループ、広告、キーワードにTrackingUrlや CustomParameterを設定&lt;br&gt;・キーワードに最終リンク先URLやスマートフォン向けURLを設定&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;In the Android app campaign, the following settings can not be made：&lt;br&gt;・Set TrackingUrl and CustomParameter for campaigns, ad groups, ads, keywords&lt;br&gt;・Set the AdvancedUrl(FinalUrl) and AdvancedMobileUrl(SmartphoneFinalUrl) for the keywords&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;225305&lt;/td&gt;&lt;td&gt;invalid category snippet header.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ補足アセット（ヘッダ）が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Category snippet header is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211019&lt;/td&gt;&lt;td&gt;Request failed because of trademark conflicts.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;商標に抵触している為、登録できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Request failed because of trademark conflicts.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>403</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0098&lt;/td&gt;&lt;td&gt;Permission denied.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;権限がありません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Permission denied.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0003&lt;/td&gt;&lt;td&gt;Frequency limit exceeded. Please try your request again later&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセス頻度が上限値に達しました。時間をおいて再度実行してください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Frequency limit exceeded. Please try your request again later.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>401</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0110&lt;/td&gt;&lt;td&gt;Require access token.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンがリクエストヘッダに存在していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;There is no access token in the request header.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0111&lt;/td&gt;&lt;td&gt;Authentication failed.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンの認証に失敗しました。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token authentication failed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0112&lt;/td&gt;&lt;td&gt;Account not found.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが見つかりませんでした。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account can not found.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0113&lt;/td&gt;&lt;td&gt;Deactivated account.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account is deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>400</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0114&lt;/td&gt;&lt;td&gt;Invalid scope.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * @param feedItemServiceSelector  (optional)
     * @return FeedItemServiceGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FeedItemServiceGetResponse feedItemServiceGetPost(FeedItemServiceSelector feedItemServiceSelector) throws RestClientException {
        return feedItemServiceGetPostWithHttpInfo(feedItemServiceSelector).getBody();
    }

    /**
     * 
     * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードアイテム情報を取得します。&lt;br&gt; ※現在、こちらのサービスは利用できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Get Feed Item information.&lt;br&gt; *Currently this service is not available.&lt;/div&gt; 
     * <p><b>503</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0099&lt;/td&gt;&lt;td&gt;Out of service.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;APIがメンテナンス中、またはご利用できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;API is under maintenance or not available to use.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>500</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0002&lt;/td&gt;&lt;td&gt;An internal error has occurred.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;内部エラーが発生しました。再度操作を実行してください。 &lt;br&gt;もし、問題が解決しない場合は、お問い合わせページをご利用ください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;An internal error has occurred. Please try again later. &lt;br&gt;If the problem continues, please contact the support team via Inquiry page for assistance. &lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>200</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0001&lt;/td&gt;&lt;td&gt;Invalid Request.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;さまざまな要因が考えられます。&lt;br&gt;主な要因は、パラメータの値が不正か、誤りがあるためにオペレーションが完了できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;This error can result for a variety of reasons. &lt;br&gt;Typically because one of the parameter values in the request is wrong or invalid and the operation cannot be completed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;R0001&lt;/td&gt;&lt;td&gt;Require.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;必須です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It is missing required parameter.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;F0001&lt;/td&gt;&lt;td&gt;Invalid format.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値の形式が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value format is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;V0001&lt;/td&gt;&lt;td&gt;Invalid value.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;値が無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The value is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;S0001&lt;/td&gt;&lt;td&gt;Invalid Status.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;ステータスが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The status is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0002&lt;/td&gt;&lt;td&gt;Over list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array exceeds the upper limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;L0001&lt;/td&gt;&lt;td&gt;Lower list size.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;配列の要素数が下限値を下回っています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of elements in the array is below the lower limit.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;D0001&lt;/td&gt;&lt;td&gt;Duplicate.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;一意な値が重複しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The unique value is duplicated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;RL001&lt;/td&gt;&lt;td&gt;Invalid relation.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;リクエストの関連性が矛盾しています。&lt;br&gt; たとえば、開始＞終了の日付指定を行なっているなど&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The relation of the request is contradictory.&lt;br&gt; For example, you are specifying the date of start &gt; end.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;LT001&lt;/td&gt;&lt;td&gt;Over limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録できる上限値を超過しています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The upper limit value that can be registered is exceeded.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;I0001&lt;/td&gt;&lt;td&gt;Deactivated Id.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;IDが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The ID is Deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210110&lt;/td&gt;&lt;td&gt;Invalid target&lt;/td&gt;&lt;td&gt;１日のスケジュール指定が上限値（6件）を超えています。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The daily schedule specification exceeds the upper limit (6 cases).&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210517&lt;/td&gt;&lt;td&gt;Exceeds maximum word limit.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードは最大10個までしか指定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;10 keywords can only be specified up to.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210126&lt;/td&gt;&lt;td&gt;Mobile app download cannot connect to.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリダウンロードキャンペーンは設定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Mobile app download cannot connect to.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;210123&lt;/td&gt;&lt;td&gt;Campaign targeting mismatch&lt;/td&gt;&lt;td&gt;targetingCampaignIdで指定したキャンペーンIDと、targetingAdGroupIdで指定した広告グループの上位キャンペーンIDが異なるため、設定できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;It can not be set because the campaign ID specified by targetingCampaignId is different from the campaign ID of the ad group specified by targetingAdGroupId.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211000&lt;/td&gt;&lt;td&gt;Cannot operate AdvancedURL(FinalURL).&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アドバンスドURLに移行済みのため、操作できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Since it has already been transferred to AdvancedURL(FinalURL), it can not be operated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211001&lt;/td&gt;&lt;td&gt;Cannot set AdvancedMobileURL(SmartphoneFinalURL).&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリダウンロードキャンペーンでは、advancedMobileURL(smartphoneFinalURL)の設定はできません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;In the app download campaign, AdvancedMobileURL(SmartphoneFinalURL) can not be set.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211003&lt;/td&gt;&lt;td&gt;Domain does not match with DisplayURL.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;表示URLと最終リンク先URLのドメインが一致していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain of DisplayURL and AdvancedURL(FinalURL) do not match.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211004&lt;/td&gt;&lt;td&gt;Cannot set under AndroidCampaign.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;Androidのアプリキャンペーンでは、以下の設定ができません：&lt;br&gt;・キャンペーン、広告グループ、広告、キーワードにTrackingUrlや CustomParameterを設定&lt;br&gt;・キーワードに最終リンク先URLやスマートフォン向けURLを設定&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;In the Android app campaign, the following settings can not be made：&lt;br&gt;・Set TrackingUrl and CustomParameter for campaigns, ad groups, ads, keywords&lt;br&gt;・Set the AdvancedUrl(FinalUrl) and AdvancedMobileUrl(SmartphoneFinalUrl) for the keywords&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;225305&lt;/td&gt;&lt;td&gt;invalid category snippet header.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ補足アセット（ヘッダ）が不正です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Category snippet header is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;211019&lt;/td&gt;&lt;td&gt;Request failed because of trademark conflicts.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;商標に抵触している為、登録できません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Request failed because of trademark conflicts.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>403</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0098&lt;/td&gt;&lt;td&gt;Permission denied.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;権限がありません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Permission denied.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0003&lt;/td&gt;&lt;td&gt;Frequency limit exceeded. Please try your request again later&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセス頻度が上限値に達しました。時間をおいて再度実行してください。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Frequency limit exceeded. Please try your request again later.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>401</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0110&lt;/td&gt;&lt;td&gt;Require access token.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンがリクエストヘッダに存在していません。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;There is no access token in the request header.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0111&lt;/td&gt;&lt;td&gt;Authentication failed.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンの認証に失敗しました。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token authentication failed.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0112&lt;/td&gt;&lt;td&gt;Account not found.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが見つかりませんでした。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account can not found.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;0113&lt;/td&gt;&lt;td&gt;Deactivated account.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The account is deactivated.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * <p><b>400</b> - &lt;p class&#x3D;\&quot;cellContent__head\&quot;&gt;Error codes&lt;/p&gt; &lt;div class&#x3D;\&quot;cellContent__body\&quot;&gt; &lt;table class&#x3D;\&quot;apiTable\&quot;&gt;   &lt;colgroup span&#x3D;\&quot;1\&quot; class&#x3D;\&quot;short\&quot;&gt;&lt;/colgroup&gt;   &lt;colgroup span&#x3D;\&quot;2\&quot;&gt;&lt;/colgroup&gt;   &lt;thead&gt;     &lt;tr&gt;&lt;th&gt;Code&lt;/th&gt;&lt;th&gt;Message&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;&lt;td&gt;0114&lt;/td&gt;&lt;td&gt;Invalid scope.&lt;/td&gt;&lt;td&gt;&lt;div lang&#x3D;\&quot;ja\&quot;&gt;アクセストークンが無効です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The access token is invalid.&lt;/div&gt;&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/div&gt; 
     * @param feedItemServiceSelector  (optional)
     * @return ResponseEntity&lt;FeedItemServiceGetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FeedItemServiceGetResponse> feedItemServiceGetPostWithHttpInfo(FeedItemServiceSelector feedItemServiceSelector) throws RestClientException {
        Object localVarPostBody = feedItemServiceSelector;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<FeedItemServiceGetResponse> localReturnType = new ParameterizedTypeReference<FeedItemServiceGetResponse>() {};
        return apiClient.invokeAPI("/FeedItemService/get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
