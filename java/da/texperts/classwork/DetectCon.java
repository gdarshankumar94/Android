package da.texperts.classwork;

import android.content.Context;
import android.net.ConnectivityManager;

public class DetectCon {
    public static boolean checkinternetconnection(Context context) {
        ConnectivityManager con_manager=(ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return (con_manager.getActiveNetworkInfo()!=null && con_manager.getActiveNetworkInfo().isAvailable()&& con_manager.getActiveNetworkInfo().isConnected());


    }
}
