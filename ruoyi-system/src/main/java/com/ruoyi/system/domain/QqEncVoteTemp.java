package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.vote.domain.QQEncVote;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 【请填写功能名称】对象 qq_enc_vote_temp
 * 
 * @author ruoyi
 * @date 2021-08-12
 */
public class QqEncVoteTemp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String candidateId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String candidateName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String voteBallotRecord;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String votePlainRecord;

    /** 投票日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date voteTime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setCandidateId(String candidateId) 
    {
        this.candidateId = candidateId;
    }

    public String getCandidateId() 
    {
        return candidateId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setCandidateName(String candidateName) 
    {
        this.candidateName = candidateName;
    }

    public String getCandidateName() 
    {
        return candidateName;
    }
    public void setVoteBallotRecord(String voteBallotRecord) 
    {
        this.voteBallotRecord = voteBallotRecord;
    }

    public String getVoteBallotRecord() 
    {
        return voteBallotRecord;
    }
    public void setVotePlainRecord(String votePlainRecord) 
    {
        this.votePlainRecord = votePlainRecord;
    }

    public String getVotePlainRecord() 
    {
        return votePlainRecord;
    }
    public void setVoteTime(Date voteTime)
    {
        this.voteTime = voteTime;
    }

    public Date getVoteTime()
    {
        return voteTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("candidateId", getCandidateId())
            .append("userName", getUserName())
            .append("candidateName", getCandidateName())
            .append("voteBallotRecord", getVoteBallotRecord())
            .append("votePlainRecord", getVotePlainRecord())
            .append("voteTime", getVoteTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
