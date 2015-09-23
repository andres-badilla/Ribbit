package com.andresbadilla.ribbit;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Andres Badilla on 9/23/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "77V26k41V0IC1FoD2kU92WosPycN7Dc6E2NfcfFd", "oyhOl5ATMzsL8D14v41GHOwqfyw5AjevoQ6OuoNO");
    }
}
