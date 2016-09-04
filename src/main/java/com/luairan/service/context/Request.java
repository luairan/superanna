package com.luairan.service.context;


import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5710013483278019357L;
    private long ballotNumber;
    private Type type;
    private long highestPromissed;
    private Proposal proposal;
    private List<SlaveNode> list;

    public long getBallotNumber() {
        return ballotNumber;
    }

    public void setBallotNumber(long ballotNumber) {
        this.ballotNumber = ballotNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getHighestPromissed() {
        return highestPromissed;
    }

    public void setHighestPromissed(long highestPromissed) {
        this.highestPromissed = highestPromissed;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    public List<SlaveNode> getList() {
        return list;
    }

    public void setList(List<SlaveNode> list) {
        this.list = list;
    }

    public enum Type {
        PrepareRequest, ProposeRequest;
    }

}