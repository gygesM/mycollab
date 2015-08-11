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
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class StandupReportWithBLOBs extends StandupReport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.whatlastday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("whatlastday")
    private String whatlastday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.whattoday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("whattoday")
    private String whattoday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.whatproblem
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("whatproblem")
    private String whatproblem;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.whatlastday
     *
     * @return the value of m_prj_standup.whatlastday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public String getWhatlastday() {
        return whatlastday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.whatlastday
     *
     * @param whatlastday the value for m_prj_standup.whatlastday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public void setWhatlastday(String whatlastday) {
        this.whatlastday = whatlastday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.whattoday
     *
     * @return the value of m_prj_standup.whattoday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public String getWhattoday() {
        return whattoday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.whattoday
     *
     * @param whattoday the value for m_prj_standup.whattoday
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public void setWhattoday(String whattoday) {
        this.whattoday = whattoday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.whatproblem
     *
     * @return the value of m_prj_standup.whatproblem
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public String getWhatproblem() {
        return whatproblem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.whatproblem
     *
     * @param whatproblem the value for m_prj_standup.whatproblem
     *
     * @mbggenerated Tue Aug 11 12:50:57 ICT 2015
     */
    public void setWhatproblem(String whatproblem) {
        this.whatproblem = whatproblem;
    }

    public enum Field {
        id,
        saccountid,
        projectid,
        forday,
        logby,
        createdtime,
        lastupdatedtime,
        whatlastday,
        whattoday,
        whatproblem;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}