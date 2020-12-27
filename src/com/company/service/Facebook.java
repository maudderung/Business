package com.company.service;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.exception.FacebookException;
import com.restfb.types.FacebookType;
import com.restfb.types.Page;
import com.restfb.types.User;

public class Facebook {
    private final String pageAccessToken = "EAAFsXtBUMtoBAKE2wag30aiEwAPs570dNGHZBYPdIWcfxiu2xiWmdAI5qfXFzgrKcg6GaIqcZB69AmU4MmIf0sDfQdD3IfcFoJmmewOKvu2ZBrhw2i247Bj75roylP7TYl3NYpf346nfzYJmUJnZBdWBlG6s0mGhXKoCBi2JJ8voP6Y2ZAJIRVZAtXAvk7ECEMgZCD26zQ87oZB83ddTwQRP";
    private final String pageID = "103491761677156";
    private FacebookClient fbClient;
    private User myuser = null;
    private Page mypage = null;

    public void makePost(String text) {
        try {
            fbClient = new DefaultFacebookClient(pageAccessToken,Version.LATEST);
            myuser = fbClient.fetchObject("me", User.class);
            mypage = fbClient.fetchObject(pageID, Page.class);
            fbClient.publish(pageID + "/feed", FacebookType.class, Parameter.with("message",  text));

        } catch (FacebookException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
