package cn.controller;

import cn.pojo.Drug;
import cn.service.DrugInfoserviceImpl;
import cn.utils.StringToDate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "药品信息接口")
public class DrugController {
    @Resource
    DrugInfoserviceImpl drugInfoservice;

    @ApiOperation(value = "按条件查询药品信息", notes = "按处方类别，药品状态，创建时间，药品名称或者编码或者厂家查找")
    @ApiImplicitParam(paramType = "query", name = "mType", value = "处方类别", defaultValue = "2")
    @GetMapping("/getDrugInfo")
    public List<Drug> getDrugInfo(Integer mType) {
        return drugInfoservice.getDrugInfo(mType);
    }

}

//
//@ApiImplicitParams({
//        @ApiImplicitParam(paramType = "query", name = "mType", value = "处方类别",
//                required = false, defaultValue = "2"),
//        @ApiImplicitParam(paramType = "query", name = "status", value = "药品状态"
//                , required = false, defaultValue = "1"),
//        @ApiImplicitParam(paramType = "query", name = "mName", value = "药品名称"
//                , required = false, defaultValue = "1"),
//        @ApiImplicitParam(paramType = "query", name = "createTime", value = "创建时间"
//                , required = false, defaultValue = "2020-4-11"),
//        @ApiImplicitParam(paramType = "query", name = "mNo", value = "药品编码"
//                , required = false, defaultValue = "1"),
//        @ApiImplicitParam(paramType = "query", name = "mFactory", value = "生产厂家"
//                , required = false, defaultValue = "")
//})