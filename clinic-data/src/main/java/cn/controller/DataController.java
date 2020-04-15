package cn.controller;

import cn.pojo.Cost;
import cn.pojo.EEnjoin;
import cn.pojo.Employee;
import cn.pojo.Illness;
import cn.service.CostService;
import cn.service.EEnjoinService;
import cn.service.EmployeeService;
import cn.service.IllnessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "基础数据信息")
public class DataController {
    /**
     * 员工
     */
    @Autowired
    private EmployeeService employeeService;

    /**
     * 疾病
     */
    @Autowired
    private IllnessService illnessService;

    /**
     * 医嘱
     */
    @Autowired
    private EEnjoinService eEnjoinService;

    /**
     * 附加费
     */
    @Autowired
    private CostService costService;

    @ApiOperation(value = "通过科室查询医生", notes = "通过科室id查询医生")
    @ApiImplicitParam(paramType = "query", required = false, name = "eSection",
            value = "科室id", defaultValue = "1")
    @GetMapping("/employeeInfo")
    public List<Employee> employeeInfo(int eSection) {
        return employeeService.employeeInfo(eSection);
    }

    @ApiOperation(value = "疾病查询接口")
    @GetMapping("/illnessInfo")
    public List<Illness> illnessInfo() {
        return illnessService.illnessInfo();
    }

    @ApiOperation(value = "医嘱查询接口")
    @GetMapping("/eEnjoinInfo")
    public List<EEnjoin> eEnjoinInfo() {
        return eEnjoinService.eEnjoinInfo();
    }

    @ApiOperation(value = "附加费用查询接口", notes = "根据处方类型id查询费用")
    @ApiImplicitParam(paramType = "query", name = "reTypeId", value = "处方类型id", defaultValue = "3")
    @GetMapping("/costInfo")
    public List<Cost> costInfo(Integer reTypeId) {
        return costService.costInfo(reTypeId);
    }

}
