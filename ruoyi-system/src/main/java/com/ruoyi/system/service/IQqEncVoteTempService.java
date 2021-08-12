package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.QqEncVoteTemp;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-08-12
 */
public interface IQqEncVoteTempService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public QqEncVoteTemp selectQqEncVoteTempById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<QqEncVoteTemp> selectQqEncVoteTempList(QqEncVoteTemp qqEncVoteTemp);

    /**
     * 新增【请填写功能名称】
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 结果
     */
    public int insertQqEncVoteTemp(QqEncVoteTemp qqEncVoteTemp);

    /**
     * 修改【请填写功能名称】
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 结果
     */
    public int updateQqEncVoteTemp(QqEncVoteTemp qqEncVoteTemp);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQqEncVoteTempByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQqEncVoteTempById(String id);
}
