package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanf
 * @date 2020/8/18
 */
@RestController
@Api(tags = "接口信息", value = "接口信息")
public class TestController extends BaseController {

    @GetMapping("/user/queryByPage")
    @ApiOperation(value = "信息查询",response = UserInfo.class,responseContainer = "list")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "当前页码", example = "1", dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "size", value = "每页条数", example = "10", dataType = "int")
    })
   public String test(){
        return getToken();
    }
}
