package com.ruoyi.web.task;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.Vote;
import com.ruoyi.system.domain.QqEncVoteTemp;
import com.ruoyi.system.service.IQqEncVoteService;
import com.ruoyi.system.service.IQqEncVoteTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myTask")
public class myTask {

    @Autowired
    private IQqEncVoteTempService tempService;

//    @Autowired
//    private IQQEncVoteService voteService;

    @Autowired
    private IQqEncVoteService voteService;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {
        System.out.println("执行无参方法");
        List<QqEncVoteTemp> qqEncVoteTemps = tempService.selectQqEncVoteTempList(new QqEncVoteTemp());
        for(QqEncVoteTemp aqEncVoteTemp : qqEncVoteTemps){
            Vote vote = new Vote();
            vote.setVoteBallotRecord(aqEncVoteTemp.getVoteBallotRecord());
            vote.setCandidateId(aqEncVoteTemp.getCandidateId());
            vote.setCandidateName(aqEncVoteTemp.getCandidateName());
            vote.setId(aqEncVoteTemp.getId());
            vote.setVotePlainRecord(aqEncVoteTemp.getVotePlainRecord());
            vote.setUserId(aqEncVoteTemp.getUserId());
            vote.setUserName(aqEncVoteTemp.getUserName());
            vote.setVoteTime(aqEncVoteTemp.getVoteTime());
            voteService.insertQqEncVote(vote);
//            tempService.insertQqEncVoteTemp(aqEncVoteTemp);
        }
    }
}
