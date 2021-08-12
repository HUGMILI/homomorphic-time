package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QqEncVoteMapper;
import com.ruoyi.system.domain.Vote;
import com.ruoyi.system.service.IQqEncVoteService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-08-12
 */
@Service
public class QqEncVoteServiceImpl implements IQqEncVoteService 
{
    @Autowired
    private QqEncVoteMapper qqEncVoteMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Vote selectQqEncVoteById(String id)
    {
        return qqEncVoteMapper.selectQqEncVoteById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vote 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Vote> selectQqEncVoteList(Vote vote)
    {
        return qqEncVoteMapper.selectQqEncVoteList(vote);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vote 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertQqEncVote(Vote vote)
    {
        return qqEncVoteMapper.insertQqEncVote(vote);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vote 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateQqEncVote(Vote vote)
    {
        return qqEncVoteMapper.updateQqEncVote(vote);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteQqEncVoteByIds(String ids)
    {
        return qqEncVoteMapper.deleteQqEncVoteByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteQqEncVoteById(String id)
    {
        return qqEncVoteMapper.deleteQqEncVoteById(id);
    }
}
