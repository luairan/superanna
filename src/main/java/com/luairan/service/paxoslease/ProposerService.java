package com.luairan.service.paxoslease;

/**
 * Created by luairan on 16/9/5.
 */
public interface ProposerService {

    Proposer getCurrentProposer();

    void proposerTwoBefore();

    void proposerTwoAfter();

    void proposerStart() throws InterruptedException;

    void proposer() throws InterruptedException;

    void cancle();
}

