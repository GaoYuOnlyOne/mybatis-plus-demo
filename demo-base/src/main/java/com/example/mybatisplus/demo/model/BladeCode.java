package com.example.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "blade_code")
public class BladeCode extends Model<BladeCode> {


    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long datasourceId;

    private String serviceName;

    private String codeName;

    private String tableName;

    private String tablePrefix;

    private String pkName;

    private String packageName;

    private Integer baseMode;

    private Integer wrapMode;

    private String apiPath;

    private String webPath;

    private Integer isDeleted;


}