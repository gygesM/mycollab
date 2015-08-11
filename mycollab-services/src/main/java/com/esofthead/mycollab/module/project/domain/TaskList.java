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
/*Domain class of table m_prj_task_list*/
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_task_list")
public class TaskList extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.id
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.name
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.projectid
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("projectid")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.createdTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.lastUpdatedTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.sAccountId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.milestoneId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("milestoneId")
    private Integer milestoneid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.owner
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("owner")
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.groupIndex
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("groupIndex")
    private Integer groupindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.status
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.createduser
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createduser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.prjKey
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Column("prjKey")
    private Integer prjkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task_list.description
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        TaskList item = (TaskList)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(841, 195).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.id
     *
     * @return the value of m_prj_task_list.id
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.id
     *
     * @param id the value for m_prj_task_list.id
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.name
     *
     * @return the value of m_prj_task_list.name
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.name
     *
     * @param name the value for m_prj_task_list.name
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.projectid
     *
     * @return the value of m_prj_task_list.projectid
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.projectid
     *
     * @param projectid the value for m_prj_task_list.projectid
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.createdTime
     *
     * @return the value of m_prj_task_list.createdTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.createdTime
     *
     * @param createdtime the value for m_prj_task_list.createdTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.lastUpdatedTime
     *
     * @return the value of m_prj_task_list.lastUpdatedTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_task_list.lastUpdatedTime
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.sAccountId
     *
     * @return the value of m_prj_task_list.sAccountId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.sAccountId
     *
     * @param saccountid the value for m_prj_task_list.sAccountId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.milestoneId
     *
     * @return the value of m_prj_task_list.milestoneId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getMilestoneid() {
        return milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.milestoneId
     *
     * @param milestoneid the value for m_prj_task_list.milestoneId
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setMilestoneid(Integer milestoneid) {
        this.milestoneid = milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.owner
     *
     * @return the value of m_prj_task_list.owner
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.owner
     *
     * @param owner the value for m_prj_task_list.owner
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.groupIndex
     *
     * @return the value of m_prj_task_list.groupIndex
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getGroupindex() {
        return groupindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.groupIndex
     *
     * @param groupindex the value for m_prj_task_list.groupIndex
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setGroupindex(Integer groupindex) {
        this.groupindex = groupindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.status
     *
     * @return the value of m_prj_task_list.status
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.status
     *
     * @param status the value for m_prj_task_list.status
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.createduser
     *
     * @return the value of m_prj_task_list.createduser
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.createduser
     *
     * @param createduser the value for m_prj_task_list.createduser
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.prjKey
     *
     * @return the value of m_prj_task_list.prjKey
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public Integer getPrjkey() {
        return prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.prjKey
     *
     * @param prjkey the value for m_prj_task_list.prjKey
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setPrjkey(Integer prjkey) {
        this.prjkey = prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task_list.description
     *
     * @return the value of m_prj_task_list.description
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task_list.description
     *
     * @param description the value for m_prj_task_list.description
     *
     * @mbggenerated Wed Jul 29 14:45:43 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        name,
        projectid,
        createdtime,
        lastupdatedtime,
        saccountid,
        milestoneid,
        owner,
        groupindex,
        status,
        createduser,
        prjkey,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}