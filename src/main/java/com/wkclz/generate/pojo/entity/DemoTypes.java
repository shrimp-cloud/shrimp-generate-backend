package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table demo_types (demo-全类型) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class DemoTypes extends BaseEntity {

    /**
     * type_int
     */
    @Desc("type_int")
    private Integer typeInt;

    /**
     * type_bigint
     */
    @Desc("type_bigint")
    private Long typeBigint;

    /**
     * type_binary
     */
    @Desc("type_binary")
    private byte[] typeBinary;

    /**
     * type_bit
     */
    @Desc("type_bit")
    private Boolean typeBit;

    /**
     * type_blob
     */
    @Desc("type_blob")
    private byte[] typeBlob;

    /**
     * type_char
     */
    @Desc("type_char")
    private String typeChar;

    /**
     * type_date
     */
    @Desc("type_date")
    private Date typeDate;

    /**
     * type_datetime
     */
    @Desc("type_datetime")
    private Date typeDatetime;

    /**
     * type_decimal
     */
    @Desc("type_decimal")
    private BigDecimal typeDecimal;

    /**
     * type_double
     */
    @Desc("type_double")
    private Double typeDouble;

    /**
     * type_float
     */
    @Desc("type_float")
    private Float typeFloat;

    /**
     * type_geometry
     */
    @Desc("type_geometry")
    private byte[] typeGeometry;

    /**
     * type_geometrycollection
     */
    @Desc("type_geometrycollection")
    private Object typeGeometrycollection;

    /**
     * type_integer
     */
    @Desc("type_integer")
    private Integer typeInteger;

    /**
     * type_json [MBG不支持JSON]
     */
    @Desc("type_json [MBG不支持JSON]")
    private String typeJson;

    /**
     * type_linestring
     */
    @Desc("type_linestring")
    private Object typeLinestring;

    /**
     * type_longblob
     */
    @Desc("type_longblob")
    private byte[] typeLongblob;

    /**
     * type_longtext
     */
    @Desc("type_longtext")
    private String typeLongtext;

    /**
     * type_mediumblob
     */
    @Desc("type_mediumblob")
    private byte[] typeMediumblob;

    /**
     * type_mediumint
     */
    @Desc("type_mediumint")
    private Integer typeMediumint;

    /**
     * type_mediumtext
     */
    @Desc("type_mediumtext")
    private String typeMediumtext;

    /**
     * type_multilinestring
     */
    @Desc("type_multilinestring")
    private Object typeMultilinestring;

    /**
     * type_multipoint
     */
    @Desc("type_multipoint")
    private Object typeMultipoint;

    /**
     * type_multipolygon
     */
    @Desc("type_multipolygon")
    private Object typeMultipolygon;

    /**
     * type_numeric
     */
    @Desc("type_numeric")
    private BigDecimal typeNumeric;

    /**
     * type_point
     */
    @Desc("type_point")
    private Object typePoint;

    /**
     * type_polygon
     */
    @Desc("type_polygon")
    private Object typePolygon;

    /**
     * type_real
     */
    @Desc("type_real")
    private Double typeReal;

    /**
     * type_text
     */
    @Desc("type_text")
    private String typeText;

    /**
     * type_time
     */
    @Desc("type_time")
    private Date typeTime;

    /**
     * type_timestamp
     */
    @Desc("type_timestamp")
    private Date typeTimestamp;

    /**
     * type_tinyblob
     */
    @Desc("type_tinyblob")
    private byte[] typeTinyblob;

    /**
     * type_tinyint
     */
    @Desc("type_tinyint")
    private Integer typeTinyint;

    /**
     * type_tinytext
     */
    @Desc("type_tinytext")
    private String typeTinytext;

    /**
     * type_varbinary
     */
    @Desc("type_varbinary")
    private byte[] typeVarbinary;

    /**
     * type_varchar
     */
    @Desc("type_varchar")
    private String typeVarchar;

    /**
     * type_year
     */
    @Desc("type_year")
    private Date typeYear;


    public static DemoTypes copy(DemoTypes source, DemoTypes target){
        if (target == null ){ target = new DemoTypes();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setTypeInt(source.getTypeInt());
        target.setTypeBigint(source.getTypeBigint());
        target.setTypeBinary(source.getTypeBinary());
        target.setTypeBit(source.getTypeBit());
        target.setTypeBlob(source.getTypeBlob());
        target.setTypeChar(source.getTypeChar());
        target.setTypeDate(source.getTypeDate());
        target.setTypeDatetime(source.getTypeDatetime());
        target.setTypeDecimal(source.getTypeDecimal());
        target.setTypeDouble(source.getTypeDouble());
        target.setTypeFloat(source.getTypeFloat());
        target.setTypeGeometry(source.getTypeGeometry());
        target.setTypeGeometrycollection(source.getTypeGeometrycollection());
        target.setTypeInteger(source.getTypeInteger());
        target.setTypeJson(source.getTypeJson());
        target.setTypeLinestring(source.getTypeLinestring());
        target.setTypeLongblob(source.getTypeLongblob());
        target.setTypeLongtext(source.getTypeLongtext());
        target.setTypeMediumblob(source.getTypeMediumblob());
        target.setTypeMediumint(source.getTypeMediumint());
        target.setTypeMediumtext(source.getTypeMediumtext());
        target.setTypeMultilinestring(source.getTypeMultilinestring());
        target.setTypeMultipoint(source.getTypeMultipoint());
        target.setTypeMultipolygon(source.getTypeMultipolygon());
        target.setTypeNumeric(source.getTypeNumeric());
        target.setTypePoint(source.getTypePoint());
        target.setTypePolygon(source.getTypePolygon());
        target.setTypeReal(source.getTypeReal());
        target.setTypeText(source.getTypeText());
        target.setTypeTime(source.getTypeTime());
        target.setTypeTimestamp(source.getTypeTimestamp());
        target.setTypeTinyblob(source.getTypeTinyblob());
        target.setTypeTinyint(source.getTypeTinyint());
        target.setTypeTinytext(source.getTypeTinytext());
        target.setTypeVarbinary(source.getTypeVarbinary());
        target.setTypeVarchar(source.getTypeVarchar());
        target.setTypeYear(source.getTypeYear());
        target.setSort(source.getSort());
        target.setCreateTime(source.getCreateTime());
        target.setCreateBy(source.getCreateBy());
        target.setUpdateTime(source.getUpdateTime());
        target.setUpdateBy(source.getUpdateBy());
        target.setComments(source.getComments());
        target.setVersion(source.getVersion());
        target.setStatus(source.getStatus());
        return target;
    }

    public static DemoTypes copyIfNotNull(DemoTypes source, DemoTypes target){
        if (target == null ){ target = new DemoTypes();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getTypeInt() != null){ target.setTypeInt(source.getTypeInt()); }
        if (source.getTypeBigint() != null){ target.setTypeBigint(source.getTypeBigint()); }
        if (source.getTypeBinary() != null){ target.setTypeBinary(source.getTypeBinary()); }
        if (source.getTypeBit() != null){ target.setTypeBit(source.getTypeBit()); }
        if (source.getTypeBlob() != null){ target.setTypeBlob(source.getTypeBlob()); }
        if (source.getTypeChar() != null){ target.setTypeChar(source.getTypeChar()); }
        if (source.getTypeDate() != null){ target.setTypeDate(source.getTypeDate()); }
        if (source.getTypeDatetime() != null){ target.setTypeDatetime(source.getTypeDatetime()); }
        if (source.getTypeDecimal() != null){ target.setTypeDecimal(source.getTypeDecimal()); }
        if (source.getTypeDouble() != null){ target.setTypeDouble(source.getTypeDouble()); }
        if (source.getTypeFloat() != null){ target.setTypeFloat(source.getTypeFloat()); }
        if (source.getTypeGeometry() != null){ target.setTypeGeometry(source.getTypeGeometry()); }
        if (source.getTypeGeometrycollection() != null){ target.setTypeGeometrycollection(source.getTypeGeometrycollection()); }
        if (source.getTypeInteger() != null){ target.setTypeInteger(source.getTypeInteger()); }
        if (source.getTypeJson() != null){ target.setTypeJson(source.getTypeJson()); }
        if (source.getTypeLinestring() != null){ target.setTypeLinestring(source.getTypeLinestring()); }
        if (source.getTypeLongblob() != null){ target.setTypeLongblob(source.getTypeLongblob()); }
        if (source.getTypeLongtext() != null){ target.setTypeLongtext(source.getTypeLongtext()); }
        if (source.getTypeMediumblob() != null){ target.setTypeMediumblob(source.getTypeMediumblob()); }
        if (source.getTypeMediumint() != null){ target.setTypeMediumint(source.getTypeMediumint()); }
        if (source.getTypeMediumtext() != null){ target.setTypeMediumtext(source.getTypeMediumtext()); }
        if (source.getTypeMultilinestring() != null){ target.setTypeMultilinestring(source.getTypeMultilinestring()); }
        if (source.getTypeMultipoint() != null){ target.setTypeMultipoint(source.getTypeMultipoint()); }
        if (source.getTypeMultipolygon() != null){ target.setTypeMultipolygon(source.getTypeMultipolygon()); }
        if (source.getTypeNumeric() != null){ target.setTypeNumeric(source.getTypeNumeric()); }
        if (source.getTypePoint() != null){ target.setTypePoint(source.getTypePoint()); }
        if (source.getTypePolygon() != null){ target.setTypePolygon(source.getTypePolygon()); }
        if (source.getTypeReal() != null){ target.setTypeReal(source.getTypeReal()); }
        if (source.getTypeText() != null){ target.setTypeText(source.getTypeText()); }
        if (source.getTypeTime() != null){ target.setTypeTime(source.getTypeTime()); }
        if (source.getTypeTimestamp() != null){ target.setTypeTimestamp(source.getTypeTimestamp()); }
        if (source.getTypeTinyblob() != null){ target.setTypeTinyblob(source.getTypeTinyblob()); }
        if (source.getTypeTinyint() != null){ target.setTypeTinyint(source.getTypeTinyint()); }
        if (source.getTypeTinytext() != null){ target.setTypeTinytext(source.getTypeTinytext()); }
        if (source.getTypeVarbinary() != null){ target.setTypeVarbinary(source.getTypeVarbinary()); }
        if (source.getTypeVarchar() != null){ target.setTypeVarchar(source.getTypeVarchar()); }
        if (source.getTypeYear() != null){ target.setTypeYear(source.getTypeYear()); }
        if (source.getSort() != null){ target.setSort(source.getSort()); }
        if (source.getCreateTime() != null){ target.setCreateTime(source.getCreateTime()); }
        if (source.getCreateBy() != null){ target.setCreateBy(source.getCreateBy()); }
        if (source.getUpdateTime() != null){ target.setUpdateTime(source.getUpdateTime()); }
        if (source.getUpdateBy() != null){ target.setUpdateBy(source.getUpdateBy()); }
        if (source.getComments() != null){ target.setComments(source.getComments()); }
        if (source.getVersion() != null){ target.setVersion(source.getVersion()); }
        if (source.getStatus() != null){ target.setStatus(source.getStatus()); }
        return target;
    }

}

