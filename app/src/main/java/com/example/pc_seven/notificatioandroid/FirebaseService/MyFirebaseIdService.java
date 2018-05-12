package com.example.pc_seven.notificatioandroid.FirebaseService;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override

    public void onTokenRefresh() {

        super.onTokenRefresh();
        sendNewTokenToServer(FirebaseInstanceId.getInstance().getToken());

    }
    private void sendNewTokenToServer(String token) {
        //here you can update your tocken in the server
        //in my case , i just print  refreshed tocken
        Log.d("SERGIOToken",token);

        }

}
