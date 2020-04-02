package com.ldgroup.ldmall.ldmallproductservice.dao.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Table(name = "stream_box")
public class SBox {
    @Id
    private String streamBoxId;
    private String streamLineId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double capability;
    private Byte useState;//0未使用，1前部分使用，2后部分使用，3已全部使用（全部占用，和两部分占用）
    private Byte opState;
    private String setId;
    private String reqId;
    private String specId;
    private String preSetId;
    private Double preUseCapability;
    private String lastSetId;
    private Double lastUseCapability;

    public SBox() {
    }

    public SBox(String streamBoxId, String streamLineId, LocalDateTime startTime, LocalDateTime endTime, Double capability, Byte useState, Byte opState, String setId, String reqId, String specId, String preSetId, Double preUseCapability, String lastSetId, Double lastUseCapability) {
        this.streamBoxId = streamBoxId;
        this.streamLineId = streamLineId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capability = capability;
        this.useState = useState;
        this.opState = opState;
        this.setId = setId;
        this.reqId = reqId;
        this.specId = specId;
        this.preSetId = preSetId;
        this.preUseCapability = preUseCapability;
        this.lastSetId = lastSetId;
        this.lastUseCapability = lastUseCapability;
    }

    public String getStreamBoxId() {
        return streamBoxId;
    }

    public void setStreamBoxId(String streamBoxId) {
        this.streamBoxId = streamBoxId;
    }

    public String getStreamLineId() {
        return streamLineId;
    }

    public void setStreamLineId(String streamLineId) {
        this.streamLineId = streamLineId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Double getCapability() {
        return capability;
    }

    public void setCapability(Double capability) {
        this.capability = capability;
    }

    public Byte getUseState() {
        return useState;
    }

    public void setUseState(Byte useState) {
        this.useState = useState;
    }

    public Byte getOpState() {
        return opState;
    }

    public void setOpState(Byte opState) {
        this.opState = opState;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getPreSetId() {
        return preSetId;
    }

    public void setPreSetId(String preSetId) {
        this.preSetId = preSetId;
    }

    public Double getPreUseCapability() {
        return preUseCapability;
    }

    public void setPreUseCapability(Double preUseCapability) {
        this.preUseCapability = preUseCapability;
    }

    public String getLastSetId() {
        return lastSetId;
    }

    public void setLastSetId(String lastSetId) {
        this.lastSetId = lastSetId;
    }

    public Double getLastUseCapability() {
        return lastUseCapability;
    }

    public void setLastUseCapability(Double lastUseCapability) {
        this.lastUseCapability = lastUseCapability;
    }

    @Override
    public String toString() {
        return "SBox{" +
                "streamBoxId='" + streamBoxId + '\'' +
                ", streamLineId='" + streamLineId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", capability=" + capability +
                ", useState=" + useState +
                ", opState=" + opState +
                ", setId='" + setId + '\'' +
                ", reqId='" + reqId + '\'' +
                ", specId='" + specId + '\'' +
                ", preSetId='" + preSetId + '\'' +
                ", preUseCapability=" + preUseCapability +
                ", lastSetId='" + lastSetId + '\'' +
                ", lastUseCapability=" + lastUseCapability +
                '}';
    }
}
