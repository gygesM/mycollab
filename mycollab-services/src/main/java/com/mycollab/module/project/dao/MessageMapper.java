/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.Message;
import com.mycollab.module.project.domain.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface MessageMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int countByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int deleteByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    List<Message> selectByExampleWithBLOBs(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    List<Message> selectByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    Message selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    int updateByPrimaryKey(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    Integer insertAndReturnKey(Message value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_message
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    void massUpdateWithSession(@Param("record") Message record, @Param("primaryKeys") List primaryKeys);
}