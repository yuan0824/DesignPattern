package com.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("google.com");
        bannedSites.add("twitter.com");
        bannedSites.add("youtube.com");
    }
    @Override
    public void connect(String domain) throws Exception {
        if(bannedSites.contains(domain)){
            throw new Exception("Access Denied");
        }
        realInternet.connect(domain);
    }
}
