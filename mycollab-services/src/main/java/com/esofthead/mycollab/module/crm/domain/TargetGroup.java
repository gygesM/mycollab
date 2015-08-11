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
/*Domain class of table m_crm_target_list*/
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_crm_target_list")
public class TargetGroup extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.id
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.name
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.type
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.description
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Length(max=4000, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.createdTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.createdUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.sAccountId
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.assignUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_target_list.lastUpdatedTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        TargetGroup item = (TargetGroup)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(361, 1651).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.id
     *
     * @return the value of m_crm_target_list.id
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.id
     *
     * @param id the value for m_crm_target_list.id
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.name
     *
     * @return the value of m_crm_target_list.name
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.name
     *
     * @param name the value for m_crm_target_list.name
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.type
     *
     * @return the value of m_crm_target_list.type
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.type
     *
     * @param type the value for m_crm_target_list.type
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.description
     *
     * @return the value of m_crm_target_list.description
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.description
     *
     * @param description the value for m_crm_target_list.description
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.createdTime
     *
     * @return the value of m_crm_target_list.createdTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.createdTime
     *
     * @param createdtime the value for m_crm_target_list.createdTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.createdUser
     *
     * @return the value of m_crm_target_list.createdUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.createdUser
     *
     * @param createduser the value for m_crm_target_list.createdUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.sAccountId
     *
     * @return the value of m_crm_target_list.sAccountId
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.sAccountId
     *
     * @param saccountid the value for m_crm_target_list.sAccountId
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.assignUser
     *
     * @return the value of m_crm_target_list.assignUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.assignUser
     *
     * @param assignuser the value for m_crm_target_list.assignUser
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_target_list.lastUpdatedTime
     *
     * @return the value of m_crm_target_list.lastUpdatedTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_target_list.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_crm_target_list.lastUpdatedTime
     *
     * @mbggenerated Tue Aug 11 12:50:52 ICT 2015
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public enum Field {
        id,
        name,
        type,
        description,
        createdtime,
        createduser,
        saccountid,
        assignuser,
        lastupdatedtime;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}