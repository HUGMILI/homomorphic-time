package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QqEncVoteTempMapper;
import com.ruoyi.system.domain.QqEncVoteTemp;
import com.ruoyi.system.service.IQqEncVoteTempService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-08-12
 */
@Service
public class QqEncVoteTempServiceImpl implements IQqEncVoteTempService 
{
    @Autowired
    private QqEncVoteTempMapper qqEncVoteTempMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public QqEncVoteTemp selectQqEncVoteTempById(String id)
    {
        return qqEncVoteTempMapper.selectQqEncVoteTempById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<QqEncVoteTemp> selectQqEncVoteTempList(QqEncVoteTemp qqEncVoteTemp)
    {
        return qqEncVoteTempMapper.selectQqEncVoteTempList(qqEncVoteTemp);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertQqEncVoteTemp(QqEncVoteTemp qqEncVoteTemp)
    {
        return qqEncVoteTempMapper.insertQqEncVoteTemp(qqEncVoteTemp);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param qqEncVoteTemp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateQqEncVoteTemp(QqEncVoteTemp qqEncVoteTemp)
    {
        return qqEncVoteTempMapper.updateQqEncVoteTemp(qqEncVoteTemp);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteQqEncVoteTempByIds(String ids)
    {
        return qqEncVoteTempMapper.deleteQqEncVoteTempByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteQqEncVoteTempById(String id)
    {
        return qqEncVoteTempMapper.deleteQqEncVoteTempById(id);
    }
}
