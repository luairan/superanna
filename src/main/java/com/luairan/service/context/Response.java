package com.luairan.service.context;


import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = -1462066735778786535L;


    private long ballotNumber;
    private Type type;
    private Proposal accpetedProposal;

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

    public Proposal getAccpetedProposal() {
        return accpetedProposal;
    }

    public void setAccpetedProposal(Proposal accpetedProposal) {
        this.accpetedProposal = accpetedProposal;
    }

    public List<SlaveNode> getList() {
        return list;
    }

    public void setList(List<SlaveNode> list) {
        this.list = list;
    }

    public enum Type {
        Closed, PrepareResponse, ProposeResponse;
    }

}