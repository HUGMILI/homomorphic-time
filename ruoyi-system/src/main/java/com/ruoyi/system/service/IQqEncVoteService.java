package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Vote;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-08-12
 */
public interface IQqEncVoteService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Vote selectQqEncVoteById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vote 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Vote> selectQqEncVoteList(Vote vote);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vote 【请填写功能名称】
     * @return 结果
     */
    public int insertQqEncVote(Vote vote);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vote 【请填写功能名称】
     * @return 结果
     */
    public int updateQqEncVote(Vote vote);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQqEncVoteByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQqEncVoteById(String id);
}
