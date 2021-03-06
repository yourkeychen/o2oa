package com.x.attendance.entity;


import com.x.base.core.entity.JpaObject;
import com.x.base.core.entity.SliceJpaObject;
import com.x.base.core.entity.annotation.ContainerEntity;
import com.x.base.core.project.annotation.FieldDescribe;

import javax.persistence.*;

@ContainerEntity
@Entity
@Table(name = PersistenceProperties.AttendanceQywxDetail.table, uniqueConstraints = @UniqueConstraint(name = PersistenceProperties.AttendanceQywxDetail.table
        + JpaObject.IndexNameMiddle + JpaObject.DefaultUniqueConstraintSuffix, columnNames = { JpaObject.IDCOLUMN,
        JpaObject.CREATETIMECOLUMN, JpaObject.UPDATETIMECOLUMN, JpaObject.SEQUENCECOLUMN }))
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AttendanceQywxDetail extends SliceJpaObject  {

    private static final long serialVersionUID = -1447276817950216827L;
    private static final String TABLE = PersistenceProperties.AttendanceQywxDetail.table;

    @Override
    public void onPersist() throws Exception {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    @FieldDescribe("数据库主键,自动生成.")
    @Id
    @Column(length = length_id, name = ColumnNamePrefix + id_FIELDNAME)
    private String id = createId();
    /*
     * =============================================================================
     * ===== 以上为 JpaObject 默认字段
     * =============================================================================
     * =====
     */


    @FieldDescribe("用户id")
    @Column(name = ColumnNamePrefix + "userid", length = length_96B)
    private String userid;

    @FieldDescribe("打卡规则名称")
    @Column(name = ColumnNamePrefix + "groupname", length = length_128B)
    private String groupname;

    @FieldDescribe("打卡类型。字符串，目前有：上班打卡，下班打卡，外出打卡")
    @Column(name = ColumnNamePrefix + "checkin_type", length = length_128B)
    private String checkin_type;

    @FieldDescribe("打卡时间。Unix时间戳")
    @Column(name = ColumnNamePrefix + "checkin_time")
    private long checkin_time;

    @FieldDescribe("异常类型，字符串，包括：时间异常，地点异常，未打卡，wifi异常，非常用设备。如果有多个异常，以分号间隔")
    @Column(name = ColumnNamePrefix + "exception_type", length = length_255B)
    private String exception_type;

    @FieldDescribe("打卡地点title")
    @Column(name = ColumnNamePrefix + "location_title", length = length_255B)
    private String location_title;

    @FieldDescribe("打卡地点详情")
    @Column(name = ColumnNamePrefix + "location_detail", length = length_255B)
    private String location_detail;

    @FieldDescribe("打卡wifi名称")
    @Column(name = ColumnNamePrefix + "wifiname", length = length_255B)
    private String wifiname;

    @FieldDescribe("打卡备注")
    @Column(name = ColumnNamePrefix + "notes", length = length_255B)
    private String notes;

//    @FieldDescribe("用户id")
//    @Column(name = ColumnNamePrefix + "userid", length = length_96B)
//    private String wifimac;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getCheckin_type() {
        return checkin_type;
    }

    public void setCheckin_type(String checkin_type) {
        this.checkin_type = checkin_type;
    }

    public long getCheckin_time() {
        return checkin_time;
    }

    public void setCheckin_time(long checkin_time) {
        this.checkin_time = checkin_time;
    }

    public String getException_type() {
        return exception_type;
    }

    public void setException_type(String exception_type) {
        this.exception_type = exception_type;
    }

    public String getLocation_title() {
        return location_title;
    }

    public void setLocation_title(String location_title) {
        this.location_title = location_title;
    }

    public String getLocation_detail() {
        return location_detail;
    }

    public void setLocation_detail(String location_detail) {
        this.location_detail = location_detail;
    }

    public String getWifiname() {
        return wifiname;
    }

    public void setWifiname(String wifiname) {
        this.wifiname = wifiname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
