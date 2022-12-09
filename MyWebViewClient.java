package da.texperts.classwork;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {






    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        String hostnme="URL GOES HERE";
        Uri uri= Uri.parse(url);
        if (url.startsWith("file:")|| uri.getHost() != null && uri.getHost().endsWith(hostnme))
        {return false;
    }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
view.getContext().startActivity(intent);
        return true;
    }





}
