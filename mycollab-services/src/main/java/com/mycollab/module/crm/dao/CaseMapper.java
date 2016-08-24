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
package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.CaseExample;
import com.mycollab.module.crm.domain.CaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CaseMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int countByExample(CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int deleteByExample(CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int insert(CaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int insertSelective(CaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    List<CaseWithBLOBs> selectByExampleWithBLOBs(CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    CaseWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int updateByExampleSelective(@Param("record") CaseWithBLOBs record, @Param("example") CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") CaseWithBLOBs record, @Param("example") CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int updateByPrimaryKeySelective(CaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(CaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    Integer insertAndReturnKey(CaseWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_case
     *
     * @mbggenerated Wed Aug 24 11:44:36 ICT 2016
     */
    void massUpdateWithSession(@Param("record") CaseWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}