package com.project.auth.entity;

import java.time.LocalDateTime;

import com.mybatis.commom.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author auto
 * @since 2022-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="XcUser对象", description="")
public class XcUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String salt;

    private String name;

    @ApiModelProperty(value = "头像")
    private String userpic;

    private String utype;

    private LocalDateTime birthday;

    private String sex;

    private String email;

    private String phone;

    private String qq;

    @ApiModelProperty(value = "用户状态")
    private String status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
