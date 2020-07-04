package com.salesforce.androidsdk.reactnative.ui;

import com.facebook.react.bridge.Callback;
import com.salesforce.androidsdk.rest.ClientManager;
import com.salesforce.androidsdk.rest.RestClient;
import com.salesforce.androidsdk.ui.SalesforceActivityInterface;

public interface SalesforceReactActivityInterface extends SalesforceActivityInterface {

    void showReactDevOptionsDialog();
    void authenticate(final Callback successCallback, final Callback errorCallback);
    void getAuthCredentials(Callback successCallback, Callback errorCallback);
    void logout(final Callback successCallback);
    ClientManager buildClientManager();
    RestClient getRestClient();

}
